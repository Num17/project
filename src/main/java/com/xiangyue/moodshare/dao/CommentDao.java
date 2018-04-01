package com.xiangyue.moodshare.dao;

import java.util.List;

import com.xiangyue.moodshare.entity.Comment;

public interface CommentDao {

    void insert(Comment comment);

    void delete(Long cid);

    List<Comment> getComments(Long nid);

    List<Comment> findByNewsIds(List<Long> newsIds);

}
