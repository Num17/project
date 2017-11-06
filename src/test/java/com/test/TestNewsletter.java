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
	 * ˵˵����
	 */
	@Test
	public void insert() {
		Newsletter newsletter = new Newsletter();
		newsletter.setNid(null);
		newsletter.setLetter("ArrayList��LinkedList�ı���������һ����˳�������һ����ѭ��˫����.");
		newsletter.setUserId(5L);
		newsletter.setCreateTime(new SimpleDateFormat("yyyy-MM-dd  HH:mm").format(new Date()));
		newsletter.setUserName("�侲");
		newsletterDao.insert(newsletter);
	}

	/**
	 * ��ѯ�����˶�̬���������һ��������userId������д����ȡ���û������ж�̬�������ǲ�ѯ�����˶�̬��
	 */
	@Test
	public void select() {
		List<Newsletter> list = newsletterDao.getNewsletterList(1, 5, null);
		System.out.println(list);
	}

	/**
	 * ����nidɾ������˵˵����������������ni������ʧ
	 */
	@Test
	public void delete() {
		newsletterDao.delete(1L);
	}

	/**
	 * ���ޣ������û���userId������״̬��nid������userId��,����
	 */
	@Test
	public void thumb() {
		newsletterService.thumbs("6", "2");
	}

}
