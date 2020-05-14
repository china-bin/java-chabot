package com.springboot.fast.model.qo;

import lombok.Data;

@Data
public class JavaComileQO {
    private String javaSource;
    private Long excuteTimeLimit;
    private String excuteArgs;
}
