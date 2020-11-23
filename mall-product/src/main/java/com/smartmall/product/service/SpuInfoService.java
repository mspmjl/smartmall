package com.smartmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stmartmall.common.utils.PageUtils;
import com.smartmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-11-11 21:18:45
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

