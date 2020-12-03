package com.smartmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 16:52:50
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

