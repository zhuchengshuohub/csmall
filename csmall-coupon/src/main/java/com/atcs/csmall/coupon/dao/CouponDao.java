package com.atcs.csmall.coupon.dao;

import com.atcs.csmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 18:43:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
