package com.jiedangou.i17dl.api.sdk.bean.param.req.ordervideo;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单视频-视频列表
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class VideolistReq extends BaseReq {

    /**
     * 第几页
     */
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 每页大小
     */
    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 订单号
     */
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
