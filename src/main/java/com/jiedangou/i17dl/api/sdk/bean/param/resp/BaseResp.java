package com.jiedangou.i17dl.api.sdk.bean.param.resp;

import org.nutz.lang.util.NutMap;

/**
 * Created on 2017/11/19
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class BaseResp {

    private Integer status;

    private String info;

    private NutMap data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }
}
