package com.smartmall.product;

import com.smartmall.product.entity.CategoryEntity;
import com.smartmall.product.service.BrandService;
import com.smartmall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by Miaojiale on 2020/10/27.
 */
@SpringBootTest
public class MallProductTest {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;
//    @Autowired
//    OSSClient ossClient;

    @Test
    public void test() {
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();
        for (CategoryEntity categoryEntity : categoryEntities) {
            System.out.println("======:" + categoryEntity);
        }
    }

    @Test
    public void testUpload() {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
       /* String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "";
        String accessKeySecret = "1GPg1sGSyBIg4EjqjY1pEAImy3P9Kw";

        // 创建OSSClient实例。*/

        // 创建PutObjectRequest对象。
//        File file = new File("D:\\screenshot.png");
//        PutObjectRequest putObjectRequest = new PutObjectRequest("smartmall-mjl", file.getName(), file);

        // 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
        // ObjectMetadata metadata = new ObjectMetadata();
        // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
        // metadata.setObjectAcl(CannedAccessControlList.Private);
        // putObjectRequest.setMetadata(metadata);

        // 上传文件。
//        ossClient.putObject(putObjectRequest);

        // 关闭OSSClient。
//        ossClient.shutdown();
    }
}
