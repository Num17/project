package com.xiangyue.moodshare.entity;

import java.util.List;

//`aid` bigint(20) NOT NULL AUTO_INCREMENT,
//`content` varchar(255) DEFAULT NULL,
//`huserName` varchar(35) DEFAULT NULL,
//`huserImg` varchar(255) DEFAULT NULL,
//`buserName` varchar(35) DEFAULT NULL,
//`buserImg` varchar(255) DEFAULT NULL,
//`cid` bigint(20) DEFAULT NULL,
public class Answer {

	private Long aid;
	private String content;
	private Long huserId;
	private String huserName;
	private String huserImg;
	private Long buserId;
	private String buserName;
	private String buserImg;
	private Long cid;
	private List<Zanswer> zanswers;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getHuserId() {
		return huserId;
	}

	public void setHuserId(Long huserId) {
		this.huserId = huserId;
	}

	public Long getBuserId() {
		return buserId;
	}

	public void setBuserId(Long buserId) {
		this.buserId = buserId;
	}

	public List<Zanswer> getZanswers() {
		return zanswers;
	}

	public void setZanswers(List<Zanswer> zanswers) {
		this.zanswers = zanswers;
	}

	public Long getAid() {
		return aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHuserName() {
		return huserName;
	}

	public void setHuserName(String huserName) {
		this.huserName = huserName;
	}

	public String getHuserImg() {
		return huserImg;
	}

	public void setHuserImg(String huserImg) {
		this.huserImg = huserImg;
	}

	public String getBuserName() {
		return buserName;
	}

	public void setBuserName(String buserName) {
		this.buserName = buserName;
	}

	public String getBuserImg() {
		return buserImg;
	}

	public void setBuserImg(String buserImg) {
		this.buserImg = buserImg;
	}

	public Answer() {

	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", content=" + content + ", huserName=" + huserName + ", huserImg=" + huserImg
				+ ", buserName=" + buserName + ", buserImg=" + buserImg + "]";
	}

}
