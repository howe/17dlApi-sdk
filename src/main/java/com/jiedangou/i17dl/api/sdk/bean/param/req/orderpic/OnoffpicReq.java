package com.jiedangou.i17dl.api.sdk.bean.param.req.orderpic;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单截图-上下号截图数量
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class OnoffpicReq extends BaseReq {

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
