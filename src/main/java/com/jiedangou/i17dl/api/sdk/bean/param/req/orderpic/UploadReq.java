package com.jiedangou.i17dl.api.sdk.bean.param.req.orderpic;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单截图-上传截图
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class UploadReq extends BaseReq {

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
     * 截图路径 无域名
     */
    private String picPath;

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * 截图类型
     * 0 普通截图
     * 1 上号截图
     * 2 下号截图
     */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * 图片描述
     * 0 填上传原因
     * 1 填上号截图
     * 2 填下号截图
     */
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
