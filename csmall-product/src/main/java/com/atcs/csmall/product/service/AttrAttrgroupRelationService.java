package com.atcs.csmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atcs.common.utils.PageUtils;
import com.atcs.csmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 03:01:28
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

