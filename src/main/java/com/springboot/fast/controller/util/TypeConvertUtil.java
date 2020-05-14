package com.springboot.fast.controller.util;

import org.apache.commons.beanutils.ConvertUtils;

/**
 * 类型转换
 */
public class TypeConvertUtil {

    /**
     * 将 类似 "23,12,44" 字符串转换为数组
     * @param str
     * @return
     */
    public static final Integer[] stringToIntgerArray(String str) {
        String[] strArray = str.split(",");
        return (Integer[]) ConvertUtils.convert(strArray, Integer.class);
    }

    public static final Long[] stringToLongArray(String str) {
        String[] strArray = str.split(",");
        return (Long[]) ConvertUtils.convert(strArray, Long.class);
    }
}
