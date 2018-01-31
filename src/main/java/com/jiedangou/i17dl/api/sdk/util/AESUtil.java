package com.jiedangou.i17dl.api.sdk.util;

import org.nutz.log.Log;
import org.nutz.log.Logs;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created on 2018/1/20
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class AESUtil {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";

    /**
     * 加密
     *
     * @param data 加密的字符串
     * @param key  解密的key
     * @return
     */

    public static String encrypt(String data, String key) {

        byte[] crypted = null;
        try {
            SecretKeySpec skey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            crypted = cipher.doFinal(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return org.nutz.repo.Base64.encodeToString(crypted, true);
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    private static byte[] parseHexStr2Byte(String hexStr) {

        if (hexStr.length() < 1)
            return null;
        byte[] b = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            b[i] = (byte) (high * 16 + low);
        }
        return b;

    }

    /**
     * 解密
     *
     * @param data 解密的字符串
     * @param key  解密的key
     * @return
     */
    public String decrypt(String data, String key) {

        byte[] output = null;
        try {
            SecretKeySpec skey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, skey);
            output = cipher.doFinal(parseHexStr2Byte(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(output);
    }
}
