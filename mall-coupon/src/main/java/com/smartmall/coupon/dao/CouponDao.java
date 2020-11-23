package com.smartmall.coupon.dao;

import com.smartmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-10-26 16:52:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
