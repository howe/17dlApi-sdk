package com.jiedangou.i17dl.api.sdk.bean.param.req.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class SearchhistoryReq extends BaseReq {

    /**
     * 第几页
     */
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 每页大小
     */
    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
