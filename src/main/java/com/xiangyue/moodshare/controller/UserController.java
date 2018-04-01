package com.xiangyue.moodshare.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xiangyue.commons.utils.BaseResponseMessage;
import com.xiangyue.commons.utils.StringUtils;
import com.xiangyue.commons.utils.TimeFormat;
import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("/user-login")
	public BaseResponseMessage login(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpServletRequest request) {

		User user = userService.getUserByNameAndPwd(username, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			return BaseResponseMessage.successMessage;
		}
		return BaseResponseMessage.errorMessage;
	}

	@RequestMapping("/user_logout")
	public String loginOut(HttpServletRequest request) {
		request.getSession().invalidate();
		return "index";
	}

	@ResponseBody
	@RequestMapping("/user-res")
	public BaseResponseMessage registeredUser(User user) {
		if (userService.checkUsername(user.getUserName())) {
			userService.insert(user);
			return BaseResponseMessage.successMessage;
		}
		return BaseResponseMessage.errorMessage;
	}

	@ResponseBody
	@RequestMapping("/user-checkusername")
	public BaseResponseMessage checkUsername(@RequestParam("userName") String userName) {
		if (userService.checkUsername(userName))
			return BaseResponseMessage.successMessage;
		return BaseResponseMessage.errorMessage;
	}

	@RequestMapping("/user_updateheadimage")
	public String updateHeadImg(HttpServletRequest request, HttpSession session,
			@RequestParam("file") CommonsMultipartFile file) {
		String realPath = session.getServletContext().getRealPath("/");
		User user = (User) session.getAttribute("user");
		if (StringUtils.notNull(file.getOriginalFilename())) {
			String fileName = TimeFormat.getTime() + file.getOriginalFilename();
			String path = realPath + "/headerimg/" + fileName;
			File f = new File(path);

			if (!f.exists())
				f.mkdirs();
			try {
				file.transferTo(f);
				user.setUserImg((request.getContextPath() + "/headerimg/" + fileName));
				
				
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "usermessage";
	}
}
