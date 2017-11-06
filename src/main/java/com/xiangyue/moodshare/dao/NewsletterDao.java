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
	 * ���µ���
	 * 
	 * @param thumbsUserId
	 */
	void thumbs(String thumbsUserId);

	/**
	 * ��ȡ�������˵�id�ַ���(��,����)
	 * 
	 * @param nid
	 * @return thumbs
	 */
	String getThumbsById(Long nid);

	Integer getTotal();
}
