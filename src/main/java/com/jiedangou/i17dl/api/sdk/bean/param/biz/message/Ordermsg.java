package com.jiedangou.i17dl.api.sdk.bean.param.biz.message;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Message;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Messageorder;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Ordermsg {

    private List<Message> list;

    public List<Message> getList() {
        return list;
    }

    public void setList(List<Message> list) {
        this.list = list;
    }

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    private Messageorder order;

    public Messageorder getOrder() {
        return order;
    }

    public void setOrder(Messageorder order) {
        this.order = order;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
