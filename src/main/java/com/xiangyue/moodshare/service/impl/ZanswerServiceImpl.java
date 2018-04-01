package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.ZanswerDao;
import com.xiangyue.moodshare.entity.Zanswer;
import com.xiangyue.moodshare.service.ZanswerService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

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

    @Override
    public List<Zanswer> findByAnswerIds(Set<Long> longs) {
        if (longs == null || longs.size() == 0) {
            return Collections.emptyList();
        }
        return zanswerDao.findByAnswerIds(longs);
    }

}
