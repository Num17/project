package com.xiangyue.moodshare.service;

import com.xiangyue.moodshare.entity.User;

public interface UserService {

	User getUserByNameAndPwd(String name, String password);

	/**
	 * 用户信息修改
	 * 
	 * @param user
	 */
	void update(User user);

	/**
	 * 用户注册
	 * 
	 * @param user
	 */
	void insert(User user);

	/**
	 * 登录
	 * 
	 * @param 用户id
	 * @return 用户所有信息
	 */
	User getById(Long id);

	Boolean checkUsername(String userName);

	void setUserBlack(String username);
}
