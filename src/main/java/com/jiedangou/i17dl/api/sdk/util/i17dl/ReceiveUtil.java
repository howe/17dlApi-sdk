package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Resp;
import com.jiedangou.i17dl.api.sdk.bean.param.req.receive.*;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;
import com.jiedangou.i17dl.api.sdk.util.RSAUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * Created by Jianghao on 2018/1/23
 *
 * @howechiang
 */
public class ReceiveUtil {

    /**
     * Openapi - 订单操作-接单
     * {"status":1,"info":"接单成功","data":{}}
     *
     * @param orderId     订单号
     * @param payPassword 支付密码
     * @param publicKey   17DL公钥
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp receiveorder(String orderId, String payPassword, String publicKey, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(payPassword)) {
                throw new Exception("payPassword为空");
            } else if (Strings.isBlank(publicKey)) {
                throw new Exception("publicKey为空");
            } else {
                ReceiveorderReq req = new ReceiveorderReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setPassword(RSAUtil.encrypt(publicKey, payPassword));
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/receiveorder", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-申请异常
     * {"status":1,"info":"提交异常成功","data":{}}
     *
     * @param orderId     订单号
     * @param content     异常原因
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp exception(String orderId, String content, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(content)) {
                throw new Exception("content为空");
            } else {
                ExceptionReq req = new ExceptionReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setContent(content);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/exception", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-申请仲裁
     * {"status":115,"info":"不能申请仲裁","data":{}}
     *
     * @param orderId     订单号
     * @param content     仲裁原因
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp arbitrate(String orderId, String content, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(content)) {
                throw new Exception("content为空");
            } else {
                ArbitrateReq req = new ArbitrateReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setContent(content);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/arbitrate", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-取消申请仲裁
     * {"status":115,"info":"不能取消申请仲裁","data":{}}
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp cancelarbitrate(String orderId, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else {
                CancelarbitrateReq req = new CancelarbitrateReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/cancelarbitrate", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-申请撤销
     * {"status":1,"info":"申请撤销成功","data":{}}
     *
     * @param orderId      订单号
     * @param payPassword  支付密码
     * @param publicKey    17DL公钥
     * @param partTrainFee 代练需支付的代练费
     * @param partDeposit  打手需赔付的保证金
     * @param content      撤销原因
     * @param source       17代练提供source
     * @param key          17代练提供secret
     * @param accessToken  登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp revoke(String orderId, String payPassword, String publicKey, Double partTrainFee, Double partDeposit, String content, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(payPassword)) {
                throw new Exception("payPassword为空");
            } else if (Strings.isBlank(publicKey)) {
                throw new Exception("publicKey为空");
            } else if (Lang.isEmpty(partTrainFee)) {
                throw new Exception("partTrainFee为空");
            } else if (Lang.isEmpty(partDeposit)) {
                throw new Exception("partDeposit为空");
            } else if (Strings.isBlank(content)) {
                throw new Exception("content为空");
            } else {
                RevokeReq req = new RevokeReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setPassword(RSAUtil.encrypt(publicKey, payPassword));
                req.setPartTrainFee(partTrainFee);
                req.setPartDeposit(partDeposit);
                req.setContent(content);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/revoke", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-取消申请撤销
     * {"status":1,"info":"取消申请撤销成功","data":{}}
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp cancelrevoke(String orderId, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else {
                CancelrevokeReq req = new CancelrevokeReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/cancelrevoke", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-申请验收
     * {"status":115,"info":"不能申请完成此单","data":{}}
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp accepted(String orderId, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else {
                AcceptedReq req = new AcceptedReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/accepted", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-同意申请撤销
     * {"status":115,"info":"不能同意撤销","data":{}}
     *
     * @param orderId     订单号
     * @param payPassword 支付密码
     * @param publicKey   17DL公钥
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp agreerevoke(String orderId, String payPassword, String publicKey, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(payPassword)) {
                throw new Exception("payPassword为空");
            } else if (Strings.isBlank(publicKey)) {
                throw new Exception("publicKey为空");
            } else {
                AgreerevokeReq req = new AgreerevokeReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setPassword(RSAUtil.encrypt(publicKey, payPassword));
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/agreerevoke", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-取消申请验收
     * {"status":115,"info":"不能取消申请完成订单","data":{}}
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp cancelaccepted(String orderId, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else {
                CancelacceptedReq req = new CancelacceptedReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/cancelaccepted", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单操作-取消异常
     * {"status":1,"info":"取消异常成功","data":{}}
     *
     * @param orderId     订单号
     * @param content     取消异常原因
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    public static Resp cancelexception(String orderId, String content, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(content)) {
                throw new Exception("content为空");
            } else {
                CancelexceptionReq req = new CancelexceptionReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setContent(content);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/receive/cancelexception", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return new Resp(resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
