package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.Answer;

import java.util.List;
import java.util.Set;

public interface AnswerService {

	void insert(Answer answer);

	void delete(Long aid);

    List<Answer> findByCommentIds(Set<Long> longs);

}
