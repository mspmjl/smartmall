package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-11-11 21:18:45
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

