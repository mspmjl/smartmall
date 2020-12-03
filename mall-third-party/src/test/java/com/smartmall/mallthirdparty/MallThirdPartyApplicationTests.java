package com.smartmall.mallthirdparty;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class MallThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;

    @Value("${spring.cloud.alicloud.access-key}")
    String key;

    @Test
    void contextLoads() {
        // 创建PutObjectRequest对象。
        File file = new File("D:\\screenshot2.png");
        PutObjectRequest putObjectRequest = new PutObjectRequest("smartmall-mjl", file.getName(), file);
        // 上传文件。
        ossClient.putObject(putObjectRequest);

        // 关闭OSSClient。
        ossClient.shutdown();
    }

    @Test
    void test(){
        System.out.println(key);
    }
}
