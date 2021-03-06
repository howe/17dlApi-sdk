package com.jiedangou.i17dl.api.sdk.bean.param.req.receive;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单操作-取消申请验收
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class CancelacceptedReq extends BaseReq {

    /**
     * 订单号
     */
    private String orderId;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
