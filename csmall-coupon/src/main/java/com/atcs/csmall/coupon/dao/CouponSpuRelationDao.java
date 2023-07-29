package com.atcs.csmall.coupon.dao;

import com.atcs.csmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 18:43:19
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
