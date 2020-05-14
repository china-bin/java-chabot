package com.springboot.fast.model.util;

public class FileUtil {

    /**
     * 获取文件名中对 扩展名
     * @return
     */
    public static String getFileExtensiont(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public static void main(String[] args) {
        System.out.println(getFileExtensiont("sdfsdfsdf.png"));
    }
}
