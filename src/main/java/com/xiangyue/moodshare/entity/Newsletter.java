package com.xiangyue.moodshare.entity;

import java.util.List;

//`nid` bigint(20) NOT NULL AUTO_INCREMENT,
//`letter` varchar(255) DEFAULT NULL,
//`letterimage` varchar(255) DEFAULT NULL,
//`lettervedio` varchar(255) DEFAULT NULL,
//`thumbsCount` bigint(20) DEFAULT NULL,
//`thumbsUserId` text,
//`createTime` date DEFAULT NULL,
//`userName` varchar(28) DEFAULT NULL,
//`userImg` varchar(255) DEFAULT NULL,
//`userId` bigint(20) DEFAULT NULL,
public class Newsletter {

	private Long nid;
	private String letter;
	private String letterimage;
	private String lettervedio;
	private Long thumbsCount;
	private String thumbsUserId;
	private String createTime;
	private String userName;
	private String userImg;
	private Long userId;
	private List<Comment> comments;

	public Newsletter() {

	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Long getNid() {
		return nid;
	}

	public void setNid(Long nid) {
		this.nid = nid;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public String getLetterimage() {
		return letterimage;
	}

	public void setLetterimage(String letterimage) {
		this.letterimage = letterimage;
	}

	public String getLettervedio() {
		return lettervedio;
	}

	public void setLettervedio(String lettervedio) {
		this.lettervedio = lettervedio;
	}

	public Long getThumbsCount() {
		return thumbsCount;
	}

	public void setThumbsCount(Long thumbsCount) {
		this.thumbsCount = thumbsCount;
	}

	public String getThumbsUserId() {
		return thumbsUserId;
	}

	public void setThumbsUserId(String thumbsUserId) {
		this.thumbsUserId = thumbsUserId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Newsletter [nid=" + nid + ", letter=" + letter + ", letterimage=" + letterimage + ", lettervedio="
				+ lettervedio + ", thumbsCount=" + thumbsCount + ", thumbsUserId=" + thumbsUserId + ", createTime="
				+ createTime + ", userName=" + userName + ", userImg=" + userImg + ", userId=" + userId + "]";
	}

}
