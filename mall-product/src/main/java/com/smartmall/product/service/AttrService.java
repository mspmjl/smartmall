package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stmartmall.common.utils.PageUtils;
import com.smartmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-24 22:49:27
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
