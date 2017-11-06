package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.ZanswerDao;
import com.xiangyue.moodshare.entity.Zanswer;
import com.xiangyue.moodshare.service.ZanswerService;

@Service
public class ZanswerServiceImpl implements ZanswerService {

	@Autowired
	private ZanswerDao zanswerDao;

	@Override
	public void insert(Zanswer zanswer) {
		zanswerDao.insert(zanswer);
	}

	@Override
	public void delete(Long zid) {
		zanswerDao.delete(zid);
	}

}
