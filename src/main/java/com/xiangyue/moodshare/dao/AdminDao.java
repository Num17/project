package com.xiangyue.moodshare.dao;

import java.util.List;

import com.xiangyue.moodshare.entity.Admin;

public interface AdminDao {

	void insert(Admin admin);

	List<Admin> getAdminList();

	void delete(String adminName);
}
