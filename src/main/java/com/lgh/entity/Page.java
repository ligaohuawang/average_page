package com.lgh.entity;

import java.util.List;

//TODO A1 定义一个page实体用来接收分页信息（6大要素）
public class Page {


    private int currentPage=1;//当前页 默认是第一页
    private int pageSize=3;//每页显示多少条？默认是3
    private int total;//总条数，从后台数据库得到
    private int totalPage;//总页数，根据总条数和每页显示多少条来算
    List<?> list;//用来存放所有数据的集合
    private String url;//分页跳转的地址



    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
