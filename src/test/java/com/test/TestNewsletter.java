package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.dao.NewsletterDao;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.service.NewsletterService;

import Basetest.BaseTest;

public class TestNewsletter extends BaseTest {

	@Autowired
	private NewsletterDao newsletterDao;

	@Autowired
	private NewsletterService newsletterService;

	/**
	 * 说说发表
	 */
	@Test
	public void insert() {
		Newsletter newsletter = new Newsletter();
		newsletter.setNid(null);
		newsletter.setLetter("ArrayList与LinkedList的本质区别是一个是顺序表，另外一个是循环双链表.");
		newsletter.setUserId(5L);
		newsletter.setCreateTime(new SimpleDateFormat("yyyy-MM-dd  HH:mm").format(new Date()));
		newsletter.setUserName("冷静");
		newsletterDao.insert(newsletter);
	}

	/**
	 * 查询所有人动态，其中最后一个参数是userId，如果有代表获取该用户的所有动态，否则是查询所有人动态。
	 */
	@Test
	public void select() {
		List<Newsletter> list = newsletterDao.getNewsletterList(1, 5, null);
		System.out.println(list);
	}

	/**
	 * 传入nid删除该条说说，其它外键关联这个ni都会消失
	 */
	@Test
	public void delete() {
		newsletterDao.delete(1L);
	}

	/**
	 * 点赞，传入用户的userId，该条状态的nid，存入userId以,隔开
	 */
	@Test
	public void thumb() {
		newsletterService.thumbs("6", "2");
	}

}
