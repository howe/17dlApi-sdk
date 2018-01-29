package com.jiedangou.i17dl.api.sdk.bean.param.req.ordershall;


import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class DetailReq extends BaseReq {

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
