package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.CommentDao;
import com.xiangyue.moodshare.entity.Comment;
import com.xiangyue.moodshare.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public void insert(Comment comment) {
        commentDao.insert(comment);
    }

    @Override
    public void delete(Long cid) {
        commentDao.delete(cid);
    }

    @Override
    public List<Comment> findByNewsIds(List<Long> newsIds) {
        return commentDao.findByNewsIds(newsIds);
    }
}
