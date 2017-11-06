package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.bean.PageResult;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.entity.User;

public interface NewsletterService {

	/**
	 * ˵˵����
	 * 
	 * @param newsletter
	 */
	void insert(Newsletter newsletter, User user);

	/**
	 * ɾ��˵˵
	 * 
	 * @param ˵˵id
	 */
	void delete(Long id);

	/**
	 * ���µ���
	 * 
	 * @param ���޵��û�id
	 * @param �����޵�˵˵id
	 */
	void thumbs(String userId, String id);

	PageResult<Newsletter> getNewsletterList(Integer offSet, Integer pageSize, Integer userId);

	Integer getTotal();
}
