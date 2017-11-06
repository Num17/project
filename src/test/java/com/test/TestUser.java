package com.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.UserService;

import Basetest.BaseTest;

public class TestUser extends BaseTest {

	@Autowired
	private UserService userService;

	@org.junit.Test
	public void testAdd() {
		User user = new User();
		user.setUserId(2113123L);
		user.setUserName("冷静");
		user.setGender(0);
		user.setUserAddress("江西上饶");
		user.setUserScore(0L);
		user.setUserPassword("123");
		user.setUserPhone(15853209589L);
		userService.insert(user);
	}

	@org.junit.Test
	public void testSelect() {
		User user = userService.getById(4L);
		System.out.println(user);
	}

	@org.junit.Test
	public void testUpdate() {
		User user = new User();
		user.setUserId(4L);
		user.setGender(1);
		user.setUserAddress("上饶");
		user.setUserScore(0L);
		user.setUserPassword("123");
		user.setUserPhone(15853209589L);
		userService.update(user);
	}

	@org.junit.Test
	public void testLogin() {
		System.out.println(userService.getUserByNameAndPwd("冷静", "123"));
	}
	
}
