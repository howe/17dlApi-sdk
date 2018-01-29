package com.jiedangou.i17dl.api.sdk.bean.param.req.message;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单留言-发送留言
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class LeavemsgReq extends BaseReq {

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
     * 留言内容
     */
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
