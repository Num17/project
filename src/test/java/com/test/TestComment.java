package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.entity.Comment;
import com.xiangyue.moodshare.service.CommentService;

import Basetest.BaseTest;

public class TestComment extends BaseTest {

	@Autowired
	private CommentService commentService;

	/**
	 * 评论的发表，传入userId,userName,userImg,nid 其中用户的信息从session中获取,而nid则在前端传入后端
	 */
	@Test
	public void insert() {
		Comment comment = new Comment();
		comment.setContent("对对对，可以的!");
		comment.setNid(2);
		comment.setUserId(6L);
		comment.setUserName("安然");
		commentService.insert(comment);
	}

	/**
	 * 评论删除,传入评论id删除
	 */
	@Test
	public void delete() {
		commentService.delete(1L);
	}
}
