package com.xiangyue.commons.utils;

public class BaseResponseMessage {

	private Integer code;
	private String message;
	public static BaseResponseMessage successMessage = new BaseResponseMessage(200, "ok");
	public static BaseResponseMessage errorMessage = new BaseResponseMessage(500, "no");

	public BaseResponseMessage(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public BaseResponseMessage() {

	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
