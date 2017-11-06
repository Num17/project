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
	 * ���۵ķ�������userId,userName,userImg,nid �����û�����Ϣ��session�л�ȡ,��nid����ǰ�˴�����
	 */
	@Test
	public void insert() {
		Comment comment = new Comment();
		comment.setContent("�ԶԶԣ����Ե�!");
		comment.setNid(2);
		comment.setUserId(6L);
		comment.setUserName("��Ȼ");
		commentService.insert(comment);
	}

	/**
	 * ����ɾ��,��������idɾ��
	 */
	@Test
	public void delete() {
		commentService.delete(1L);
	}
}
