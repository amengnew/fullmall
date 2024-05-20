package com.mzh.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mzh.common.utils.PageUtils;
import com.mzh.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-14 11:20:58
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

