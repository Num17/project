package com.xiangyue.moodshare.entity;

import java.util.List;

//`cid` bigint(20) NOT NULL AUTO_INCREMENT,
//`content` varchar(255) DEFAULT NULL,
//`userName` varchar(35) DEFAULT NULL,
//`userImg` varchar(255) DEFAULT NULL,
//`nid` bigint(20) DEFAULT NULL,
public class Comment {

	private Long cid;
	private String content;
	private Long userId;
	private String userName;
	private String userImg;
	private Integer nid;
	private List<Answer> answers;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", content=" + content + ", userName=" + userName + ", userImg=" + userImg + "]";
	}

}
