package com.xiangyue.moodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.UserDao;
import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void update(User user) {
		userDao.update(user);
	}

	public void insert(User user) {
		user.setUserScore(0L);
		user.setUserImg("headerimg/default_head.jpg");
		user.setState("这个人很懒,什么也没写！");
		userDao.insert(user);
	}

	public User getById(Long id) {
		return userDao.getById(id);
	}

	public User getUserByNameAndPwd(String name, String password) {
		return userDao.getUserByNameAndPwd(name, password);
	}

	public Boolean checkUsername(String userName) {
		User user = userDao.getUserByUserName(userName);
		if (user != null)
			return false;
		return true;
	}

	public void setUserBlack(String username) {
		userDao.setUserBlack(username);
	}

}
