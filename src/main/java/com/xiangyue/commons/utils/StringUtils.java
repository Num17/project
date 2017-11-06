package com.xiangyue.commons.utils;

public class StringUtils {

	public static boolean notNull(String string) {
		if (string != null && !string.equals(""))
			return true;
		return false;
	}
}
