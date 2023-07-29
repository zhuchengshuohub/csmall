package com.atcs.csmall.ware.dao;

import com.atcs.csmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 19:13:11
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
