package com.xiangyue.moodshare.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiangyue.commons.utils.CollectionUtils;
import com.xiangyue.commons.utils.StringUtils;
import com.xiangyue.moodshare.bean.PageResult;
import com.xiangyue.moodshare.dao.NewsletterDao;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.NewsletterService;

@Service
public class NewsletterServiceImpl implements NewsletterService {

	@Autowired
	private NewsletterDao newsletterDao;

	// 发表
	public void insert(Newsletter newsletter, User user) {
		newsletter.setNid(null);
		newsletter.setCreateTime(new SimpleDateFormat("yyyy-MM-dd  HH:mm").format(new Date()));
		newsletter.setUserId(user.getUserId());
		newsletter.setUserImg(user.getUserImg());
		newsletter.setUserName(user.getUserName());
		newsletterDao.insert(newsletter);
	}

	public void delete(Long id) {
		newsletterDao.delete(id);
	}

	// 点赞
	@Transactional
	public void thumbs(String userId, String id) {
		String thumbs = newsletterDao.getThumbsById(Long.valueOf(id.trim()));
		List<String> thumb = new ArrayList<String>();
		if (StringUtils.notNull(thumbs)) {
			thumb = Arrays.asList(thumbs.split(","));
			thumb = new ArrayList<String>(thumb);
			if (addUserIdOrRemove(thumb, userId))
				thumb.add(userId);
			else
				thumb.remove(userId);
		} else
			thumb.add(userId);
		thumbs = "";
		if (CollectionUtils.notNull(thumb)) {
			for (String string : thumb) {
				thumbs += string + ",";
			}
			thumbs = thumbs.substring(0, thumbs.length() - 1);
		}
		newsletterDao.thumbs(thumbs);
	}

	// 判断该用户是否点赞
	private boolean addUserIdOrRemove(List<String> thumb, String id) {
		for (String string : thumb) {
			if (string.equals(id))
				return false;
		}
		return true;
	}

	@Override
	public PageResult<Newsletter> getNewsletterList(Integer offSet, Integer pageSize, Integer userId) {

		PageResult<Newsletter> pageResult = new PageResult<Newsletter>();
		pageResult.setRows(newsletterDao.getNewsletterList(offSet - 1, pageSize, userId));
		pageResult.setPageTotal((getTotal() - 1) / pageSize + 1);
		return pageResult;
	}

	@Override
	public Integer getTotal() {
		return newsletterDao.getTotal();
	}

}
