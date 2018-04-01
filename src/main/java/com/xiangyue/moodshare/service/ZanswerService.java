package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.Zanswer;

import java.util.List;
import java.util.Set;

public interface ZanswerService {

	void insert(Zanswer zanswer);

	void delete(Long zid);

    List<Zanswer> findByAnswerIds(Set<Long> longs);

}
