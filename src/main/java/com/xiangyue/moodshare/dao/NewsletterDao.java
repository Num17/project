package com.xiangyue.moodshare.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiangyue.moodshare.entity.Newsletter;

public interface NewsletterDao {

	void insert(Newsletter newsletter);

	List<Newsletter> getNewsletterList(@Param("offSet") Integer offSet, @Param("pageSize") Integer pageSize,
			@Param("userId") Integer userId);

	void delete(Long nid);

	/**
	 * 更新点赞
	 * 
	 * @param thumbsUserId
	 */
	void thumbs(String thumbsUserId);

	/**
	 * 获取点赞了人的id字符串(以,隔开)
	 * 
	 * @param nid
	 * @return thumbs
	 */
	String getThumbsById(Long nid);

	Integer getTotal();
}
