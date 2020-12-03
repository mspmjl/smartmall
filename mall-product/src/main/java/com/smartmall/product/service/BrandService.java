package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-11-11 21:18:45
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

