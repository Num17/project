package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.Answer;

public interface AnswerService {

	void insert(Answer answer);

	void delete(Long aid);
}
