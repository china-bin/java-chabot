package com.springboot.fast.model.qo;

import lombok.Data;

@Data
public class LoginQO {
    private String username;
    private String password;
    private String captcha;
}
