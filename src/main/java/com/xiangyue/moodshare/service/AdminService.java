package com.xiangyue.moodshare.service;

import java.util.List;

import com.xiangyue.moodshare.entity.Admin;

public interface AdminService {

	void insert(Admin admin);

	List<Admin> getAdminList();

	void delete(String adminName);

}
