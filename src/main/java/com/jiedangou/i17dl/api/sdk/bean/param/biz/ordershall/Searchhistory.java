package com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.History;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Searchhistory {

    private List<History> list;

    public List<History> getList() {
        return list;
    }

    public void setList(List<History> list) {
        this.list = list;
    }

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
