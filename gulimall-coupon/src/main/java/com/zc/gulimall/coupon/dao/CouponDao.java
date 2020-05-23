package com.zc.gulimall.coupon.dao;

import com.zc.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zc
 * @email hcrxyc@163.com
 * @date 2020-05-23 18:55:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
