package com.mzh.product.dao;

import com.mzh.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-14 11:20:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
