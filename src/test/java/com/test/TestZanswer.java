package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.dao.ZanswerDao;
import com.xiangyue.moodshare.entity.Zanswer;

import Basetest.BaseTest;

public class TestZanswer extends BaseTest {

	@Autowired
	private ZanswerDao zanswerDao;

	@Test
	public void testSelect() {
		List<Zanswer> zanswers = zanswerDao.getZanswers(1L);
		System.out.println(zanswers);
	}

	@Test
	public void insert() {
		Zanswer zanswer = new Zanswer();
		zanswer.setAid(2L);
		zanswer.setBuserId(5L);
		zanswer.setBuserImg("");
		zanswer.setBuserName("¿‰æ≤");

		zanswer.setHuserId(6L);
		zanswer.setHuserImg("");
		zanswer.setHuserName("∞≤»ª");
		zanswerDao.insert(zanswer);
	}

}
