/**
 * Copyright 2015-现在 在线教学平台
 */
package com.springboot.fast.model.util;

import java.util.Random;

/**
 */
public final class StrUtil {

	private StrUtil() {
	}

	public static String getSuffix(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}

	public static String getPrefix(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	/**
	 * @return
	 */
	public static String getRandom(int bound) {
		Random ra = new Random();
		String result = "";
		for (int i = 1; i <= bound; i++) {
			result += ra.nextInt(10);
		}
		return result;
	}


}
