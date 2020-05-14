package com.springboot.fast.controller.util;

import java.util.List;

public class Page<T> {
    // 当前页数
    private long page;
    //每页的数量
    private long limit;
    // 为数据库的起始下标
    private long start;
    //数据总数
    private long total;
    // 总页数
    private long totalPage;
    private List<T> data;

    private String href;

    public Page(long page, long limit) {
        this.page = page;
        this.limit = limit;
        this.start = (page - 1) * limit;
    }
    public Page(long total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    public Page(long page, long limit, long total, List<T> data) {
        this.page = page;
        this.limit = limit;
        this.total = total;
        this.data = data;
        this.totalPage = total % limit == 0 ? total / limit : total / limit + 1;
    }

    public long getStart() {
        return start;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
