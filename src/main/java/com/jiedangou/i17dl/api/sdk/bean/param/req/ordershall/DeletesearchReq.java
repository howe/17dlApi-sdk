package com.jiedangou.i17dl.api.sdk.bean.param.req.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * Openapi - 接单大厅-删除搜索历史
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class DeletesearchReq extends BaseReq {

    private String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
