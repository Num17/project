package com.xiangyue.moodshare.dao;

import java.util.List;
import java.util.Set;

import com.xiangyue.moodshare.entity.Answer;

public interface AnswerDao {

	void insert(Answer answer);

	void delete(Long aid);

	List<Answer> getAnswers(Long cid);

    List<Answer> findByCommentIds(Set<Long> longs);

}
