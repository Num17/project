package com.xiangyue.moodshare.manager;

import com.xiangyue.moodshare.bean.PageResult;
import com.xiangyue.moodshare.entity.Answer;
import com.xiangyue.moodshare.entity.Comment;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.entity.Zanswer;
import com.xiangyue.moodshare.service.AnswerService;
import com.xiangyue.moodshare.service.CommentService;
import com.xiangyue.moodshare.service.NewsletterService;
import com.xiangyue.moodshare.service.ZanswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserShareManager {

    @Autowired
    private NewsletterService newsletterService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private ZanswerService zanswerService;

    public PageResult<Newsletter> getShareList(Integer offSet, Integer pageSize, Integer userId) {

        PageResult<Newsletter> pageResult = new PageResult<Newsletter>();
        List<Newsletter> newsletterList = newsletterService.getNewsletterList(offSet - 1, pageSize, userId);
        pageResult.setRows(newsletterList);
        pageResult.setPageTotal(newsletterService.getTotal());

        List<Long> newsIds = new ArrayList<>(5);

        for (Newsletter newsletter : newsletterList) {
            newsIds.add(newsletter.getNid());
        }

        List<Comment> commentList = commentService.findByNewsIds(newsIds);

        Map<Long, Comment> commentMap = new HashMap<>();
        Map<Integer, List<Comment>> commentListMap = new HashMap<>();
        for (Comment comment : commentList) {
            commentMap.put(comment.getCid(), comment);
            List<Comment> list = commentListMap.get(comment.getNid());
            if (list == null) {
                list = new LinkedList<>();
                list.add(comment);
                commentListMap.put(comment.getNid(), list);
            } else {
                list.add(comment);
            }
        }

        List<Answer> answerList = answerService.findByCommentIds(commentMap.keySet());
        Map<Long, Answer> answerMap = new HashMap<>();
        Map<Long, List<Answer>> answerListMap = new HashMap<>();

        for (Answer answer : answerList) {
            answerMap.put(answer.getAid(), answer);
            List<Answer> list = answerListMap.get(answer.getCid());
            if (list == null) {
                list = new LinkedList<>();
                list.add(answer);
                answerListMap.put(answer.getCid(), list);
            } else {
                list.add(answer);
            }
        }

        List<Zanswer> zanswerList = zanswerService.findByAnswerIds(answerMap.keySet());
        Map<Long, Zanswer> zanswerMap = new HashMap<>();
        Map<Long, List<Zanswer>> zanswerListMap = new HashMap<>();

        for (Zanswer zanswer : zanswerList) {
            zanswerMap.put(zanswer.getZid(), zanswer);
            List<Zanswer> list = zanswerListMap.get(zanswer.getAid());
            if (list == null) {
                list = new LinkedList<>();
                list.add(zanswer);
                zanswerListMap.put(zanswer.getAid(), list);
            } else {
                list.add(zanswer);
            }
        }

        for (Map.Entry<Long, Answer> entry : answerMap.entrySet()) {
            List<Zanswer> zanswers = zanswerListMap.get(entry.getKey());
            Answer value = entry.getValue();
            if (value != null) {
                value.setZanswers(zanswers);
            }
        }

        for (Map.Entry<Long, Comment> entry : commentMap.entrySet()) {
            List<Answer> answers = answerListMap.get(entry.getKey());
            Comment value = entry.getValue();
            if (value != null) {
                value.setAnswers(answers);
            }

        }

        for (Newsletter newsletter : newsletterList) {
            List<Comment> comments = commentListMap.get(newsletter.getNid());
            newsletter.setComments(comments);
        }

        return pageResult;

    }
}
