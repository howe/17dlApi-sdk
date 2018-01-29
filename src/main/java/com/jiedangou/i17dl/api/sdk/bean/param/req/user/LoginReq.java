package com.jiedangou.i17dl.api.sdk.bean.param.req.user;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class LoginReq extends BaseReq {

    /**
     * 登录手机号
     */
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 未加密的private_key对password进行AES加密
     * AES加密模式ECB结果BASE64
     */
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * RSA加密private_key
     */
    private String private_key;

    public String getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(String private_key) {
        this.private_key = private_key;
    }
}
