package com.xiangyue.commons.utils;

import java.util.Collection;

public class CollectionUtils {

	public static boolean notNull(Collection collection) {
		if (collection.size() > 0 && collection != null)
			return true;
		return false;
	}
}
