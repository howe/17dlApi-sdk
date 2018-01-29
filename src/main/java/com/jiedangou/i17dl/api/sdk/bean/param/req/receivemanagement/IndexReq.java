package com.jiedangou.i17dl.api.sdk.bean.param.req.receivemanagement;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * 订单管理-列表
 * Created on 2018/1/22
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class IndexReq extends BaseReq {

    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    private Integer pigeSize;

    public Integer getPigeSize() {
        return pigeSize;
    }

    public void setPigeSize(Integer pigeSize) {
        this.pigeSize = pigeSize;
    }
}
