package com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Basepicture;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Gamepic {

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private List<Basepicture> list;

    public List<Basepicture> getList() {
        return list;
    }

    public void setList(List<Basepicture> list) {
        this.list = list;
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

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
