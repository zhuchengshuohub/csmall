package com.atcs.csmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atcs.common.utils.PageUtils;
import com.atcs.csmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 03:01:28
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

