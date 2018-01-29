package com.jiedangou.i17dl.api.sdk.bean.param.biz;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Sub {

    private String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    private String parent_id;

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Sub> sub;

    public List<Sub> getSub() {
        return sub;
    }

    public void setSub(List<Sub> sub) {
        this.sub = sub;
    }
}
