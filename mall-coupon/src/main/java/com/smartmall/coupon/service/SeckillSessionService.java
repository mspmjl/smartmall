package com.smartmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 16:52:50
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

