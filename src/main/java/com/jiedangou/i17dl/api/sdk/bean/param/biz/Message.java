package com.jiedangou.i17dl.api.sdk.bean.param.biz;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Message {

    private String _id;

    private Integer type;

    private Integer uid;

    private String comment;

    private Long create_time;

    private String type_msg;

    private String uid_name;

    private String avator;

    private Integer is_read;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getType_msg() {
        return type_msg;
    }

    public void setType_msg(String type_msg) {
        this.type_msg = type_msg;
    }

    public String getUid_name() {
        return uid_name;
    }

    public void setUid_name(String uid_name) {
        this.uid_name = uid_name;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public Integer getIs_read() {
        return is_read;
    }

    public void setIs_read(Integer is_read) {
        this.is_read = is_read;
    }
}
