package com.zc.gulimall.member.fegin;

import com.zc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LsC
 * @version 1.0
 * @date 2020/5/26 14:24
 * @desc  这是一个声明式的远程调用,可以调用其他微服务模块
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
