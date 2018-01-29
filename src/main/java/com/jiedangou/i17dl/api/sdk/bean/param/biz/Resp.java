package com.jiedangou.i17dl.api.sdk.bean.param.biz;

import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Resp {

    /**
     * 状态码
     */
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Resp(Integer code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public Resp() {
    }

    public Resp(BaseResp resp) {
        this.code = resp.getStatus();
        this.detail = resp.getInfo();
    }
}
