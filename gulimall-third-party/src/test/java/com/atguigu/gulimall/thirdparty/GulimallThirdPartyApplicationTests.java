package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.thirdparty.initBean.OssBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Test
    void contextLoads() throws FileNotFoundException {
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(OssBean.ENDPOINT, OssBean.ACCESSKEYID, OssBean.ACCESSKEYSECRET);
        // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        InputStream inputStream = new FileInputStream("D:\\2.jpg");
        // 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("guli-mall-xioayu", "3.jpg", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
    }

}
