package com.jiedangou.i17dl.api.sdk.util;

import org.nutz.http.*;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

import java.util.Map;

/**
 * Created on 2017/11/19
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class HttpUtil {

    /**
     * 普通Get请求
     *
     * @param url
     * @return
     */
    public static String get(String url) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else {
                return Http.get(url).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @param parms
     * @return
     */

    public static String post(String url, Map<String, Object> parms) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (parms.isEmpty()) {
                throw new Exception("parms为空");
            } else {
                return Http.post(url, parms, 10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @return
     */
    public static String post(String url) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else {
                return Http.post(url, null, 10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 带Header信息的Post请求
     *
     * @param url
     * @param header
     * @param parms
     * @return
     */
    public static String post(String url, Header header, Map<String, Object> parms) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(header)) {
                throw new Exception("header为空");
            } else if (header.getAll().isEmpty()) {
                throw new Exception("header为空");
            } else if (parms.isEmpty()) {
                throw new Exception("parms为空");
            } else {
                return Http.post3(url, parms, header, 10000).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 带Header信息Get请求
     *
     * @param url
     * @param header
     * @return
     */
    public static String get(String url, Header header) {

        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(header)) {
                throw new Exception("header为空");
            } else if (header.getAll().isEmpty()) {
                throw new Exception("header为空");
            } else {
                return Http.get(url, header, 10000).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Post发送Json请求
     *
     * @param url
     * @param json
     * @return
     */
    public static String post(String url, String json) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(json)) {
                throw new Exception("json为空");
            } else {
                Request req = Request.create(url, Request.METHOD.POST);
                req.getHeader().set("Content-Type", "application/json;charset=UTF-8");
                req.setData(json);
                Response resp = Sender.create(req).setTimeout(6000).send();
                return resp.getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Post发送Xml请求
     *
     * @param url
     * @param xml
     * @return
     */
    public static String postXml(String url, String xml) {
        try {
            if (Strings.isBlank(url)) {
                throw new Exception("url为空");
            } else if (!Strings.isUrl(url)) {
                throw new Exception("url格式不正确");
            } else if (Lang.isEmpty(xml)) {
                throw new Exception("xml为空");
            } else {
                return Http.postXML(url, xml, 10000).getContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
