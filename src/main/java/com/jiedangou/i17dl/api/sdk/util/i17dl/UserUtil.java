package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.user.Login;
import com.jiedangou.i17dl.api.sdk.bean.param.req.user.LoginReq;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.AESUtil;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;
import com.jiedangou.i17dl.api.sdk.util.RSAUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class UserUtil {

    /**
     * Openapi - 用户自动登录注册接口
     * {"status":1,"info":"登录成功","data":{"id":2097710,"access_token":"5fd4faf04a9999433fab2407f09b441f"}}
     *
     * @param phone         登录手机号
     * @param loginPassword 登录密码
     * @param privateKey    用户私有key
     * @param publicKey     17dl公钥
     * @param source        17代练提供source
     * @param key           17代练提供secret
     * @return
     */
    public static Login login(String phone, String loginPassword, String privateKey, String publicKey, String source, String key) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (!Strings.isMobile(phone)) {
                throw new Exception("phone为空");
            } else if (Strings.isBlank(loginPassword)) {
                throw new Exception("loginPassword为空");
            } else if (Strings.isBlank(publicKey)) {
                throw new Exception("publicKey为空");
            } else if (Strings.isBlank(privateKey)) {
                throw new Exception("privateKey为空");
            } else {
                LoginReq req = new LoginReq();
                req.setSource(source);
                req.setPhone(phone);
                req.setAccess_token("");
                req.setPassword(AESUtil.encrypt(loginPassword, privateKey));
                req.setPrivate_key(RSAUtil.encrypt(publicKey, privateKey));
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/user/login", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Login.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
