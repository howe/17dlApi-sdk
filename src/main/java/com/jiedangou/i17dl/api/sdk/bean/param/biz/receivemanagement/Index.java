package com.jiedangou.i17dl.api.sdk.bean.param.biz.receivemanagement;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Brieforder;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Index {

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private List<Brieforder> list;

    public List<Brieforder> getList() {
        return list;
    }

    public void setList(List<Brieforder> list) {
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

    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
