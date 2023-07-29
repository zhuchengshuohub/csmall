package com.atcs.csmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atcs.common.utils.PageUtils;
import com.atcs.csmall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Zhucs
 * @email zhuchengshuo0709@gmail.com
 * @date 2023-07-29 03:01:28
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

