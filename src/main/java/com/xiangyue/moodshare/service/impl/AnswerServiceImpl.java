package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.AnswerDao;
import com.xiangyue.moodshare.entity.Answer;
import com.xiangyue.moodshare.service.AnswerService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public void insert(Answer answer) {
        answerDao.insert(answer);
    }

    @Override
    public void delete(Long aid) {
        answerDao.delete(aid);
    }

    @Override
    public List<Answer> findByCommentIds(Set<Long> longs) {
        if (longs == null || longs.size() == 0) {
            return Collections.emptyList();
        }
        return answerDao.findByCommentIds(longs);
    }

}
