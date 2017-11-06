package com.xiangyue.moodshare.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xiangyue.moodshare.service.UserService;

@Component
public class SetUserToBlackList {

	@Autowired
	private UserService userService;

	public void settoblack() {
		userService.setUserBlack("ÕÅ¼ÑÂ¶");
	}

}
