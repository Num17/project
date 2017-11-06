package com.xiangyue.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {

	public static String getTime() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return simpleDateFormat.format(date);
	}

	public static String getTime(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return simpleDateFormat.format(date);
	}

	/**
	 * ע�⣺format�����ϸ���ʱ���ʽ��д
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String getTime(Date date, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(date);
	}
}
