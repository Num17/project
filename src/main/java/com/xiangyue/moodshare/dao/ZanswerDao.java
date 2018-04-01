package com.xiangyue.moodshare.dao;

import java.util.List;
import java.util.Set;

import com.xiangyue.moodshare.entity.Zanswer;

public interface ZanswerDao {

	void insert(Zanswer zanswer);

	void delete(Long zid);

	List<Zanswer> getZanswers(Long aid);

    List<Zanswer> findByAnswerIds(Set<Long> longs);

}
