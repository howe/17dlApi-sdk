package com.jiedangou.i17dl.api.sdk.util.i17dl;

import com.jiedangou.i17dl.api.sdk.bean.dict.Dict;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Resp;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic.Gamepic;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic.Onoffpic;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic.Piclist;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.orderpic.Sts;
import com.jiedangou.i17dl.api.sdk.bean.param.req.orderpic.*;
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
public class OrderpicUtil {

    /**
     * Openapi - 订单截图-上传截图
     * {"status":1,"info":"截图上传成功","data":{}}
     *
     * @param orderId     订单号
     * @param picPath     截图路径 无域名
     * @param type        0普通截图 1上号截图 2下号截图
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Resp upload(String orderId, String picPath, Integer type, String comment, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Strings.isBlank(picPath)) {
                throw new Exception("picPath为空");
            } else if (Lang.isEmpty(type)) {
                throw new Exception("type为空");
            } else if (Strings.isBlank(comment)) {
                throw new Exception("comment为空");
            } else {
                UploadReq req = new UploadReq();
                req.setOrderId(orderId);
                req.setPicPath(picPath);
                req.setType(type);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setComment(comment);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/orderpic/upload", Lang.obj2nutmap(req));
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
     * Openapi - 订单截图-上下号截图列表
     * https://nutz.cn/s/c/Mc
     *
     * @param orderId     订单号
     * @param type        1上号截图 2下号截图
     * @param page        页数
     * @param pageSize    每页大小
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Gamepic gamepic(String orderId, Integer type, Integer page, Integer pageSize, String source, String key, String accessToken) {
        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else if (Strings.isBlank(orderId)) {
                throw new Exception("订单ID为空");
            } else if (Lang.isEmpty(type)) {
                throw new Exception("type为空");
            } else if (Lang.isEmpty(page)) {
                throw new Exception("page为空");
            } else if (Lang.isEmpty(pageSize)) {
                throw new Exception("pageSize为空");
            } else {
                GamepicReq req = new GamepicReq();
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setPage(page);
                req.setPageSize(pageSize);
                req.setType(type);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/orderpic/gamepic", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Gamepic.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单截图-截图列表
     * https://nutz.cn/s/c/Me
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Piclist piclist(String orderId, String source, String key, String accessToken) {

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
                PiclistReq req = new PiclistReq();
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/orderpic/piclist", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Piclist.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单截图-上下号截图数量
     * https://nutz.cn/s/c/Md
     *
     * @param orderId     订单号
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     */
    public static Onoffpic onoffpic(String orderId, String source, String key, String accessToken) {
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
                OnoffpicReq req = new OnoffpicReq();
                req.setOrderId(orderId);
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/orderpic/onoffpic", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Onoffpic.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Openapi - 订单截图-获取临时凭证
     * https://nutz.cn/s/c/MX
     *
     * @param source      17代练提供source
     * @param key         17代练提供secret
     * @param accessToken 登录时返回的登录标识，需要登录的接口则需要这个参数
     * @return
     */
    public static Sts sts(String source, String key, String accessToken) {

        try {
            if (Strings.isBlank(source)) {
                throw new Exception("source为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Strings.isBlank(accessToken)) {
                throw new Exception("accessToken为空");
            } else {
                StsReq req = new StsReq();
                req.setAccess_token(accessToken);
                req.setSource(source);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict._17DL_TEST_API_URL + "/openapi/orderpic/sts", Lang.obj2nutmap(req));
                if (json.indexOf("info") < 0) {
                    throw new Exception("接口异常");
                }
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return Lang.map2Object(resp.getData(), Sts.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
//        OSSClient client = new OSSClient(biz.getEndpoint(), biz.getAccessKeyId(), biz.getAccessKeySecret(), biz.getSecurityToken());
//        uploadObject2OSS(client, new File("D:\\wx_camera_1516520499371.mp4"), biz.getBucket(), "jdg/");
    }


//    public String uploadObject2OSS(OSSClient ossClient, File file, String bucketName, String folder) {
//        String resultStr = null;
//        try {
//            //以输入流的形式上传文件
//            InputStream is = new FileInputStream(file);
//            //文件名
//            String fileName = file.getName();
//            //文件大小
//            Long fileSize = file.length();
//            //创建上传Object的Metadata
//            ObjectMetadata metadata = new ObjectMetadata();
//            //上传的文件的长度
//            metadata.setContentLength(is.available());
//            //指定该Object被下载时的网页的缓存行为
//            metadata.setCacheControl("no-cache");
//            //指定该Object下设置Header
//            metadata.setHeader("Pragma", "no-cache");
//            //指定该Object被下载时的内容编码格式
//            metadata.setContentEncoding("utf-8");
//            //文件的MIME，定义文件的类型及网页编码，决定浏览器将以什么形式、什么编码读取文件。如果用户没有指定则根据Key或文件名的扩展名生成，
//            //如果没有扩展名则填默认值application/octet-stream
//            metadata.setContentType(getContentType(fileName));
//            //指定该Object被下载时的名称（指示MINME用户代理如何显示附加的文件，打开或下载，及文件名称）
//            metadata.setContentDisposition("filename/filesize=" + fileName + "/" + fileSize + "Byte.");
//            //上传文件   (上传文件流的形式)
//            PutObjectResult putResult = ossClient.putObject(bucketName, folder + fileName, is, metadata);
//            //解析结果
//            resultStr = putResult.getETag();
//            System.out.println(Json.toJson(ossClient));
//            System.out.println(Json.toJson(putResult));
//            System.out.println(bucketName + folder + fileName);
//        } catch (Exception e) {
//            log.error("上传阿里云OSS服务器异常." + e.getMessage(), e);
//        }
//        return resultStr;
//    }
//
//    /**
//     * 通过文件名判断并获取OSS服务文件上传时文件的contentType
//     *
//     * @param fileName 文件名
//     * @return 文件的contentType
//     */
//    public String getContentType(String fileName) {
//        //文件的后缀名
//        String fileExtension = fileName.substring(fileName.lastIndexOf("."));
//        if (".bmp".equalsIgnoreCase(fileExtension)) {
//            return "image/bmp";
//        }
//        if (".gif".equalsIgnoreCase(fileExtension)) {
//            return "image/gif";
//        }
//        if (".jpeg".equalsIgnoreCase(fileExtension) || ".jpg".equalsIgnoreCase(fileExtension) || ".png".equalsIgnoreCase(fileExtension)) {
//            return "image/jpeg";
//        }
//        if (".html".equalsIgnoreCase(fileExtension)) {
//            return "text/html";
//        }
//        if (".txt".equalsIgnoreCase(fileExtension)) {
//            return "text/plain";
//        }
//        if (".vsd".equalsIgnoreCase(fileExtension)) {
//            return "application/vnd.visio";
//        }
//        if (".ppt".equalsIgnoreCase(fileExtension) || "pptx".equalsIgnoreCase(fileExtension)) {
//            return "application/vnd.ms-powerpoint";
//        }
//        if (".doc".equalsIgnoreCase(fileExtension) || "docx".equalsIgnoreCase(fileExtension)) {
//            return "application/msword";
//        }
//        if (".xml".equalsIgnoreCase(fileExtension)) {
//            return "text/xml";
//        }
//        //默认返回类型
//        return "image/jpeg";
//    }
}
