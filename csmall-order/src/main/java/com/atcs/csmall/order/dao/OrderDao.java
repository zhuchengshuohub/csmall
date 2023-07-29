package com.atcs.csmall.order.dao;

import com.atcs.csmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 19:01:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
