package com.jiedangou.i17dl.api.sdk.bean.param.req.receive;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单操作-申请异常
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class ExceptionReq extends BaseReq {

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
     * 异常原因
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
