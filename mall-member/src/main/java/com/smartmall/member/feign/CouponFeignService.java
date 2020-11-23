package com.smartmall.member.feign;

import com.stmartmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Miaojiale on 2020/10/27.
 */

@Service
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/info/{id}")
    R info(@PathVariable("id") Long id);
}
