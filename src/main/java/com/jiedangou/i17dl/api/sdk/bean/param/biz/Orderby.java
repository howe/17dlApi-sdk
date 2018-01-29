package com.jiedangou.i17dl.api.sdk.bean.param.biz;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Orderby {

    private String orderByKey;

    public String getOrderByKey() {
        return orderByKey;
    }

    public void setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
    }

    private Integer orderByValue;

    public Integer getOrderByValue() {
        return orderByValue;
    }

    public void setOrderByValue(Integer orderByValue) {
        this.orderByValue = orderByValue;
    }

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
