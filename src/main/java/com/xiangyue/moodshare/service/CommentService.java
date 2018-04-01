package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.Comment;

import java.util.List;

public interface CommentService {

	void insert(Comment comment);

	void delete(Long cid);

	List<Comment> findByNewsIds(List<Long> newsIds);

}
