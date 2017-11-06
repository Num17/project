package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.Comment;

public interface CommentService {

	void insert(Comment comment);

	void delete(Long cid);
}
