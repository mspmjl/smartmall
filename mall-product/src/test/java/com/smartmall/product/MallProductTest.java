package com.smartmall.product;

import com.smartmall.common.utils.PageUtils;
import com.smartmall.product.entity.BrandEntity;
import com.smartmall.product.entity.CategoryEntity;
import com.smartmall.product.service.BrandService;
import com.smartmall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
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
    public void getBrandList(){
        PageUtils pageUtils = brandService.queryPage(new HashMap<>());
        List<BrandEntity> list = (List<BrandEntity>)pageUtils.getList();
        for (BrandEntity o : list) {
            System.out.println(o);
        }
    }
}
