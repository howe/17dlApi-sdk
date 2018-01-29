package com.jiedangou.i17dl.api.sdk.bean.param.biz.ordervideo;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Video;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Videolist {

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private List<Video> list;

    public List<Video> getList() {
        return list;
    }

    public void setList(List<Video> list) {
        this.list = list;
    }

    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private String orderid;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
