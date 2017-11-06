package com.xiangyue.moodshare.dao;

import org.apache.ibatis.annotations.Param;

import com.xiangyue.moodshare.entity.User;

public interface UserDao {

	User getUserByNameAndPwd(@Param("user") String username, @Param("pwd") String password);

	void update(User user);

	void insert(User user);

	User getById(Long id);

	User getUserByUserName(String userName);

	void setUserBlack(String username);

}
