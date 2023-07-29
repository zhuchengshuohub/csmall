package com.atcs.csmall.member.feign;

import com.atcs.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("csmall-coupon")
public interface FeignQuerymembercouponsService {

    @RequestMapping("/coupon/coupon/querymembercoupons/list")
    public R querymembercoupons();
}
