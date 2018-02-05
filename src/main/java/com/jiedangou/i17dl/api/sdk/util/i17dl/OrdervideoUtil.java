package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Resp;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.ordervideo.Videolist;
import com.jiedangou.i17dl.api.sdk.bean.param.req.ordervideo.UploadReq;
import com.jiedangou.i17dl.api.sdk.bean.param.req.ordervideo.VideolistReq;
import com.jiedangou.i17dl.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.i17dl.api.sdk.util.HttpUtil;
import com.jiedangou.i17dl.api.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

/**
 * Created by Jianghao on 2018/1/24
 *
 * @howechiang
 */
public class OrdervideoUtil {

    /**
     * Openapi - 订单视频-上传视频
     * {"status":1,"info":"上传成功","data":{}}
     *
     * @param orderId     订单号
     * @param url         视频地址
     * @param length      时长
     * @param width       宽度
     * @param height      高度
     * @param title       视频标题
     * @param thumbnail   封面地址
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp upload(String orderId, String url, Integer length, Integer width, Integer height, String title, String thumbnail, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(orderId)) {
                throw new Exception("orderId为空");
            } else if (Strings.isBlank(url)) {
                throw new Exception("ourl为空");
            } else if (Lang.isEmpty(length)) {
                throw new Exception("length为空");
            } else if (Lang.isEmpty(width)) {
                throw new Exception("width为空");
            } else if (Lang.isEmpty(height)) {
                throw new Exception("height为空");
            } else if (Strings.isBlank(title)) {
                throw new Exception("title为空");
            } else if (Strings.isBlank(thumbnail)) {
                throw new Exception("thumbnail为空");
            } else if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else {
                UploadReq req = new UploadReq();
                req.setOrderId(orderId);
                req.setUrl(url);
                req.setLength(length);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setWidth(width);
                req.setHeight(height);
                req.setTitle(title);
                req.setThumbnail(thumbnail);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordervideo/upload", Lang.obj2nutmap(req));
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
     * Openapi - 订单视频-视频列表
     * https://nutz.cn/s/c/Mj
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param page        页数
     * @param pageSize    每页大小
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Videolist videolist(String orderId, Integer page, Integer pageSize, String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(orderId)) {
                throw new Exception("orderId为空");
            } else if (Strings.isBlank(source)) {
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
                VideolistReq req = new VideolistReq();
                req.setOrderId(orderId);
                req.setPage(page);
                req.setPageSize(pageSize);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_API_URL + "/openapi/ordervideo/videolist", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Videolist.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
