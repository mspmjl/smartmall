package com.smartmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 17:11:04
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

