package com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Baseorder;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Search;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Index {

    private List<Baseorder> list;

    public List<Baseorder> getList() {
        return list;
    }

    public void setList(List<Baseorder> list) {
        this.list = list;
    }

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private Search search;

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
}
