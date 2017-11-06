package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.AnswerDao;
import com.xiangyue.moodshare.entity.Answer;
import com.xiangyue.moodshare.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	private AnswerDao answerDao;

	@Override
	public void insert(Answer answer) {
		answerDao.insert(answer);
	}

	@Override
	public void delete(Long aid) {
		answerDao.delete(aid);
	}

}
