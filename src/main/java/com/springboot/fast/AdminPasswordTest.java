package com.springboot.fast;

import com.springboot.fast.model.util.MD5Util;

import java.util.UUID;

public class AdminPasswordTest {

    public static void main(String[] args) {
        String securKey = UUID.randomUUID().toString();
        System.out.println("securKey:" + securKey);
        String password = "123";
        System.out.println("securtPassword:" + MD5Util.MD5(password + securKey));

    }
}
