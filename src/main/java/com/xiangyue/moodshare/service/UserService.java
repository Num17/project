package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.User;

public interface UserService {

	User getUserByNameAndPwd(String name, String password);

	/**
	 * �û���Ϣ�޸�
	 * 
	 * @param user
	 */
	void update(User user);

	/**
	 * �û�ע��
	 * 
	 * @param user
	 */
	void insert(User user);

	/**
	 * ��¼
	 * 
	 * @param �û�id
	 * @return �û�������Ϣ
	 */
	User getById(Long id);

	Boolean checkUsername(String userName);

	void setUserBlack(String username);
}
