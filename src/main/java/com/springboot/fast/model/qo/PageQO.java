package com.springboot.fast.model.qo;

import lombok.Data;

@Data
public class PageQO {
    private Integer page;
    private Integer limit;
    private String searchParams;
}
