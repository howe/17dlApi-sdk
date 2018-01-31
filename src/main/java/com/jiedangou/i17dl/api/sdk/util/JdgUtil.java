package com.jiedangou.i17dl.api.sdk.util;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import org.nutz.lang.Encoding;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;
import org.nutz.lang.util.NutMap;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class JdgUtil {

    /**
     * Map排序
     *
     * @param params 待排序对象
     * @param order  排序后的对象
     * @return
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        try {
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
            } else {
                Map<String, Object> map = new LinkedHashMap<>();
                if (Strings.equalsIgnoreCase(order, "desc")) {
                    params.entrySet().stream()
                            .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                            .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
                } else {
                    params.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey())
                            .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
                }
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @param f      过滤字段
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f) {

        try {
            if (Lang.isEmpty(f)) {
                throw new Exception("params参数为空");
            } else if (Lang.isEmpty(f)) {
                return buildParmas(params);
            } else {
                Arrays.asList(f).stream().forEach(params::remove);
                return buildParmas(params);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String j) {

        try {
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
            } else {
                params = sorting(params, "asc");
                StringBuffer sb = new StringBuffer();
                params.forEach((k, v) -> {
                    if (!Lang.isEmpty(v)) {
                        sb.append(k + "=" + ((v instanceof Date) ? Times.format(Dict.DATE_FORMART_FULL, (Date) v) : v) + j);
                    }
                });
                return Strings.removeLast(sb.toString().replaceAll(" , ", ",").replaceAll(" ,", ",").replaceAll(", ", ","), '&');
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        try {
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
            } else {
                params = sorting(params, "asc");
                StringBuffer sb = new StringBuffer();
                params.forEach((k, v) -> {
                    if (!Lang.isEmpty(v)) {
                        sb.append(k + "=" + v + "&");
                    }
                });
                return Strings.removeLast(sb.toString().replaceAll(" , ", ",").replaceAll(" ,", ",").replaceAll(", ", ","), '&');
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * URL转解码
     */
    public static class Url {

        /**
         * 加密
         *
         * @param s
         * @return
         */
        public static String encode(String s) {

            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    try {
                        return URLEncoder.encode(s, Encoding.UTF8);
                    } catch (UnsupportedEncodingException e) {
                        throw new Exception(e.getMessage());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    try {
                        return URLDecoder.decode(s, Encoding.UTF8);
                    } catch (UnsupportedEncodingException e) {
                        throw new Exception(e.getMessage());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /**
     * BASE64加解密
     */
    public static class Base64 {

        /**
         * 加密
         *
         * @param s
         * @return
         */
        public static String encode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    return org.nutz.repo.Base64.encodeToString(s.getBytes(Encoding.CHARSET_UTF8), true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s解密对象为空");
                } else {
                    return new String(org.nutz.repo.Base64.decode(s));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /**
     * 校验签名
     *
     * @param params
     * @param key
     * @return
     */
    public static Boolean checkSign(NutMap params, String key) {

        try {
            String sign = params.getString("sign");
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key密钥为空");
            } else {
                if (Strings.equalsIgnoreCase(Lang.md5(Url.encode(buildParmas(params, new String[]{"sign"})) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 判断数字是否存在数组
     *
     * @param array
     * @param val
     * @return
     */
    public static Boolean checkArrayExists(Integer[] array, Integer val) {

        try {
            if (Lang.isEmpty(array)) {
                throw new Exception("array为空");
            } else if (Lang.isEmpty(val)) {
                throw new Exception("val为空");
            } else {
                for (int a : Arrays.asList(array)) {
                    if (Lang.equals(a, val)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 判断字符串是否存在数组
     *
     * @param array
     * @param val
     * @return
     */
    public static Boolean checkArrayExists(String[] array, String val) {

        try {

            if (Lang.isEmpty(array)) {
                throw new Exception("array为空");
            } else if (Strings.isEmpty(val)) {
                throw new Exception("val为空");
            } else {
                for (String a : Arrays.asList(array)) {
                    if (Strings.equalsIgnoreCase(a, val)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 生成签名
     *
     * @param map 加密对象
     * @param key 密钥
     * @return
     */
    public static String getSign(NutMap map, String key) {
        try {

            if (Lang.isEmpty(map)) {
                throw new Exception("map为空");
            } else if (Strings.isEmpty(key)) {
                throw new Exception("key为空");
            } else {
                return Lang.md5(buildParmas(map, new String[]{"sign"}, "") + key);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @param f      过滤字段
     * @param j      连接符
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f, String j) {
        try {
            if (Lang.isEmpty(f)) {
                throw new Exception("params参数为空");
            } else if (Lang.isEmpty(f)) {
                return buildParmas(params, j);
            } else {
                Arrays.asList(f).stream().forEach(params::remove);
                return buildParmas(params, j);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
