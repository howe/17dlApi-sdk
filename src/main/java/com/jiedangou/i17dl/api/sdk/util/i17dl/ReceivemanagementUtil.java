package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Order;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.receivemanagement.Index;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.receivemanagement.Menue;
import com.jiedangou.i17dl.api.sdk.bean.param.req.receivemanagement.DetailReq;
import com.jiedangou.i17dl.api.sdk.bean.param.req.receivemanagement.IndexReq;
import com.jiedangou.i17dl.api.sdk.bean.param.req.receivemanagement.MenueReq;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * Created by Jianghao on 2018/1/23
 *
 * @howechiang
 */
public class ReceivemanagementUtil {

    /**
     * Openapi - 订单管理-订单详情
     * https://nutz.cn/s/c/MV
     * https://nutz.cn/s/c/MW
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Order detail(String orderId, String source, String key, String accessToken) {
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
                DetailReq req = new DetailReq();
                req.setSource(source);
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_DEV_API_URL + "/openapi/receivemanagement/detail", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return resp.getData().getAs("orderDetail", Order.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单管理-列表
     * https://nutz.cn/s/c/Mg
     *
     * @param page        页数
     * @param pageSize    每页大小
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Index index(Integer page, Integer pageSize, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Lang.isEmpty(page)) {
                throw new Exception("page为空");
            } else if (Lang.isEmpty(pageSize)) {
                throw new Exception("pageSize为空");
            } else {
                IndexReq req = new IndexReq();
                req.setSource(source);
                req.setPage(page);
                req.setPigeSize(pageSize);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_DEV_API_URL + "/openapi/receivemanagement/index", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Index.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单管理-菜单
     * https://nutz.cn/s/c/Mh
     *
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Menue menue(String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            }
            MenueReq req = new MenueReq();
            req.setSource(source);
            req.setAccess_token(accessToken);
            req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
            String json = HttpUtil.post(Dict._17DL_DEV_API_URL + "/openapi/receivemanagement/menue", Lang.obj2nutmap(req));
            if (json.indexOf("info") < 0) {
                throw new Exception("接口异常");
            }
            BaseResp resp = Json.fromJson(BaseResp.class, json);
            return Lang.map2Object(resp.getData(), Menue.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
