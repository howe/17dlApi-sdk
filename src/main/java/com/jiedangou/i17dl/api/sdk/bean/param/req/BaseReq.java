package com.jiedangou.i17dl.api.sdk.bean.param.req;

/**
 * Created by Jianghao on 2017/11/21
 *
 * @howechiang
 */
public class BaseReq {

    /**
     * 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 17代练提供source
     */
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 校验码，生成规则为按照主键升序排序，根据key=value进行拼接，再加上东九提供的密钥，最后进行md5
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
