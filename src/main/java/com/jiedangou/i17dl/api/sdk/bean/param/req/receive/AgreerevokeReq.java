package com.jiedangou.i17dl.api.sdk.bean.param.req.receive;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单操作-同意申请撤销
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class AgreerevokeReq extends BaseReq {

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
     * 支付密码 需RSA公钥加密
     */
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
