package com.zc.gulimall.order.dao;

import com.zc.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zc
 * @email hcrxyc@163.com
 * @date 2020-05-23 19:01:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
