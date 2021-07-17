package com.atguigu.gulimall.thirdparty.initBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: xiaoYu
 * @Date: 2021/6/12 13:11
 * @Description:
 */
@Component
public class OssBean implements InitializingBean {
    @Value("${my.oss.endpoint}")
    private String endpoint;
    @Value("${my.upload.accesskey}")
    private String accessKeyId;
    @Value("${my.upload.secretkey}")
    private String accessKeySecret;
    @Value("${my.upload.bucketname}")
    private String bucketname;
    @Value("${my.upload.host}")
    private String host;

    //公开变量
    public static String ENDPOINT;
    public static String ACCESSKEYID;
    public static String ACCESSKEYSECRET;
    public static String BUCKETNAME;
    public static String HOST;


    @Override
    public void afterPropertiesSet() throws Exception {
        ENDPOINT = endpoint;
        ACCESSKEYID = accessKeyId;
        ACCESSKEYSECRET = accessKeySecret;
        BUCKETNAME = bucketname;
        HOST = host;

    }
}