package com.jiedangou.i17dl.api.sdk.bean.param.req.receive;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单操作-申请撤销
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class RevokeReq extends BaseReq {

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

    /**
     * 代练需支付的代练费
     */
    private Double partTrainFee;

    public Double getPartTrainFee() {
        return partTrainFee;
    }

    public void setPartTrainFee(Double partTrainFee) {
        this.partTrainFee = partTrainFee;
    }

    /**
     * 打手需赔付的保证金
     */
    private Double partDeposit;

    public Double getPartDeposit() {
        return partDeposit;
    }

    public void setPartDeposit(Double partDeposit) {
        this.partDeposit = partDeposit;
    }

    /**
     * 撤销原因
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
