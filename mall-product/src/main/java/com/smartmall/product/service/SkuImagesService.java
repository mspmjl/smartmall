package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stmartmall.common.utils.PageUtils;
import com.smartmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-24 22:49:27
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
