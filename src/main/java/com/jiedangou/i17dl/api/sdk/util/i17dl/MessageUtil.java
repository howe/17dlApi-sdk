package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Resp;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.message.Ordermsg;
import com.jiedangou.i17dl.api.sdk.bean.param.req.message.LeavemsgReq;
import com.jiedangou.i17dl.api.sdk.bean.param.req.message.OrdermsgReq;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * 订单留言
 * Created by Jianghao on 2018/1/24
 */
public class MessageUtil {

    /**
     * Openapi - 订单留言-发送留言
     * {"status":1,"info":"留言成功","data":{}}
     *
     * @param orderId     订单号
     * @param comment     留言内容
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp leavemsg(String orderId, String comment, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(comment)) {
                throw new Exception("comment为空");
            } else {
                LeavemsgReq req = new LeavemsgReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setComment(comment);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_DEV_API_URL + "/openapi/message/leavemsg", Lang.obj2nutmap(req));
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
     * Openapi - 订单留言-留言列表
     * https://nutz.cn/s/c/Ml
     *
     * @param orderId     订单号
     * @param page        页数
     * @param pageSize    每页大小
     * @param id          该id之后的留言
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    public static Ordermsg ordermsg(String orderId, Integer page, Integer pageSize, String id, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Lang.isEmpty(page)) {
                throw new Exception("page为空");
            } else if (Lang.isEmpty(pageSize)) {
                throw new Exception("pageSize为空");
            } else {
                OrdermsgReq req = new OrdermsgReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setPage(page);
                req.setId(id);
                req.setPageSize(pageSize);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_DEV_API_URL + "/openapi/message/ordermsg", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Ordermsg.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
