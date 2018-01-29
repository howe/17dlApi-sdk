package com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Picture;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Piclist {

    private List<Picture> list;

    public List<Picture> getList() {
        return list;
    }

    public void setList(List<Picture> list) {
        this.list = list;
    }

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
