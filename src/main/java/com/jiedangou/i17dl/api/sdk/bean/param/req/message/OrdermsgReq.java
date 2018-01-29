package com.jiedangou.i17dl.api.sdk.bean.param.req.message;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单留言-留言列表
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class OrdermsgReq extends BaseReq {

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
     * 该id之后的留言
     * 选填
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
