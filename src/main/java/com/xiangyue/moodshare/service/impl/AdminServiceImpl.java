package com.xiangyue.moodshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangyue.moodshare.dao.AdminDao;
import com.xiangyue.moodshare.entity.Admin;
import com.xiangyue.moodshare.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public void insert(Admin admin) {
		adminDao.insert(admin);
	}

	public List<Admin> getAdminList() {
		return adminDao.getAdminList();
	}

	public void delete(String adminName) {
		adminDao.delete(adminName);
	}

}
