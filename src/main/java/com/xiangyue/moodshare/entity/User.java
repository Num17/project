package com.xiangyue.moodshare.entity;

import java.util.List;

//`userId` bigint(20) NOT NULL AUTO_INCREMENT,
//`userName` varchar(24) NOT NULL,
//`userImg` varchar(255) DEFAULT NULL,
//`userPassword` varchar(20) NOT NULL,
//`userGender` tinyint(1) NOT NULL DEFAULT '1' COMMENT '0-Å®,1-ÄÐ',
//`userPhone` char(12) DEFAULT NULL,
//`userAddress` varchar(24) DEFAULT NULL,
//`userScore` bigint(20) NOT NULL DEFAULT '0',
public class User {
	private Long userId;
	private String userName;
	private String userImg;
	private String state;
	private String userPassword;
	private Integer gender;
	private Long userPhone;
	private String userAddress;
	private Long userScore;
	private List<Newsletter> newsletters;

	public User() {

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Long getUserScore() {
		return userScore;
	}

	public void setUserScore(Long userScore) {
		this.userScore = userScore;
	}

	public List<Newsletter> getNewsletters() {
		return newsletters;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public void setNewsletters(List<Newsletter> newsletters) {
		this.newsletters = newsletters;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userImg=" + userImg + ", state=" + state
				+ ", userPassword=" + userPassword + ", gender=" + gender + ", userPhone=" + userPhone
				+ ", userAddress=" + userAddress + ", userScore=" + userScore + ", newsletters=" + newsletters + "]";
	}

}
