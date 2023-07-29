package com.atcs.csmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atcs.common.utils.PageUtils;
import com.atcs.csmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 03:01:27
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

