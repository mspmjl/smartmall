package com.smartmall.mallcoupon;

import com.smartmall.coupon.entity.CouponEntity;
import com.smartmall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class MallCouponApplicationTests {
    @Autowired
    private CouponService couponService;

    @Test
    public void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setAmount(new BigDecimal(100));
        couponEntity.setCode("100");
        couponEntity.setCouponName("减100");
        couponEntity.setId(1l);
        CouponEntity byId = couponService.getById(couponEntity);
        System.out.println(byId);
    }

}
