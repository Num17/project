package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.entity.Answer;
import com.xiangyue.moodshare.service.AnswerService;

import Basetest.BaseTest;

public class TestAnswer extends BaseTest {

	@Autowired
	private AnswerService answerService;

	@Test
	public void insert() {
		Answer answer = new Answer();
		answer.setAid(null);
		answer.setBuserId(5L);
		answer.setBuserImg("");
		answer.setBuserName("¿‰æ≤");

		answer.setHuserId(6L);
		answer.setHuserImg("");
		answer.setHuserName("∞≤»ª");
		answer.setCid(2L);
		answerService.insert(answer);
	}

	@Test
	public void delete() {
		answerService.delete(2L);
	}
}
