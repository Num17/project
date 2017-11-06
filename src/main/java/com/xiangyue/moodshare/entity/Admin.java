package com.xiangyue.moodshare.entity;

//`adminName` varchar(24) NOT NULL,
//`adminPassword` varchar(20) NOT NULL,
public class Admin {

	private Long id;
	private String adminName;
	private String adminPassword;

	public Admin() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}

}
