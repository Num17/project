package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.bean.PageResult;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.entity.User;

public interface NewsletterService {

	/**
	 * 说说发表
	 * 
	 * @param newsletter
	 */
	void insert(Newsletter newsletter, User user);

	/**
	 * 删除说说
	 * 
	 * @param 说说id
	 */
	void delete(Long id);

	/**
	 * 更新点赞
	 * 
	 * @param 点赞的用户id
	 * @param 被点赞的说说id
	 */
	void thumbs(String userId, String id);

	PageResult<Newsletter> getNewsletterList(Integer offSet, Integer pageSize, Integer userId);

	Integer getTotal();
}
