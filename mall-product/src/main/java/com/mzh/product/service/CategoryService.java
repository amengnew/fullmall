package com.mzh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mzh.common.utils.PageUtils;
import com.mzh.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-14 11:20:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

