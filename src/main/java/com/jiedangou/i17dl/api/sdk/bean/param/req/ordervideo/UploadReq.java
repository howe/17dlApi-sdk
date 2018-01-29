package com.jiedangou.i17dl.api.sdk.bean.param.req.ordervideo;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单视频-上传视频
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class UploadReq extends BaseReq {

    /**
     * 视频地址
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 时长
     */
    private Integer length;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 封面
     */
    private String thumbnail;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    /**
     * 宽度
     */
    private Integer width;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 高度
     */
    private Integer height;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 视频标题
     */
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
