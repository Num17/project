package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiangyue.moodshare.service.UserService;

import Basetest.BaseTest;

public class TestBlack extends BaseTest {

	@Autowired
	private UserService userService;

	@Test
	public void black() {
		userService.setUserBlack("ÕÅ¼ÑÂ¶");
	}

}
