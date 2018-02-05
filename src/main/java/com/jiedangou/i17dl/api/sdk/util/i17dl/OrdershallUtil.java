package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Baseorder;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Resp;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall.Index;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall.Menue;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall.Searchhistory;
import com.jiedangou.i17dl.api.sdk.bean.param.req.ordershall.*;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * Created by Jianghao on 2018/1/22
 *
 * @howechiang
 */
public class OrdershallUtil {

    /**
     * Openapi - 接单大厅-列表
     * https://nutz.cn/s/c/MU
     *
     * @param game         游戏id
     * @param gameZone     游戏区id
     * @param gameServer   游戏服id
     * @param page         第几页
     * @param pageSize     每页大小
     * @param minPrice     最低价格
     * @param maxPrice     最高价格
     * @param orderByKey   price(价格),requirement_time(代练时间),deposit(保证金)
     * @param orderByValue 3(降序)，4(升序)
     * @param keyWord      搜索关键字
     * @param source       17代练提供source
     * @param key          17代练提供secret
     * @param accessToken  登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Index index(String game, String gameZone, String gameServer, Double minPrice, Double maxPrice,
                              Integer page, Integer pageSize, String orderByKey, Integer orderByValue, String keyWord,
                              String source, String key, String accessToken) {
        try {
            if (Lang.isEmpty(page)) {
                throw new Exception("page为空");
            } else if (Lang.isEmpty(minPrice)) {
                throw new Exception("minPrice为空");
            } else if (Lang.isEmpty(maxPrice)) {
                throw new Exception("maxPrice为空");
            } else if (Lang.isEmpty(pageSize)) {
                throw new Exception("pageSize为空");
            } else if (Lang.isEmpty(orderByValue)) {
                throw new Exception("orderByValue为空");
            } else if (Strings.isBlank(orderByKey)) {
                throw new Exception("orderByKey为空");
            } else if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else {
                IndexReq req = new IndexReq();
                req.setPage(page);
                req.setPageSize(pageSize);
                req.setGame(game);
                req.setGameServer(gameServer);
                req.setGameZone(gameZone);
                req.setMinPrice(minPrice);
                req.setMaxPrice(maxPrice);
                req.setOrderByKey(orderByKey);
                req.setKeyWord(keyWord);
                req.setSource(source);
                req.setOrderByValue(orderByValue);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordershall/index", Lang.obj2nutmap(req));
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
     * Openapi - 接单大厅-删除搜索历史
     * {"status":13,"info":"搜索历史不存在","data":{}}
     *
     * @param _id         历史记录I
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp deletesearch(String _id, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(_id)) {
                throw new Exception("_id为空");
            } else if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else {
                DeletesearchReq req = new DeletesearchReq();
                req.setSource(source);
                req.set_id(_id);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordershall/deletesearch", Lang.obj2nutmap(req));
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
     * Openapi - 接单大厅-搜索历史
     * {"status":1,"info":"获取成功","data":{"list":[],"count":0,"page":1,"pageSize":20}}
     *
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param page        页数
     * @param pageSize    每页大小
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    public static Searchhistory searchhistory(Integer page, Integer pageSize, String source, String key, String accessToken) {

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
                SearchhistoryReq req = new SearchhistoryReq();
                req.setPage(page);
                req.setPageSize(pageSize);
                req.setSource(source);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordershall/searchhistory", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Searchhistory.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 接单大厅-菜单
     * https://nutz.cn/s/c/Mm
     *
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    public static Menue menue(String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else {
                MenueReq req = new MenueReq();
                req.setSource(source);
                req.setAccess_token(accessToken);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordershall/menue", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Menue.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 接单大厅-订单详情
     * https://nutz.cn/s/c/MT
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Baseorder detail(String orderId, String source, String key, String accessToken) {
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
                req.setAccess_token(accessToken);
                req.setOrderId(orderId);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordershall/detail", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return resp.getData().getAs("orderDetail", Baseorder.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
