package com.mzh.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mzh.common.utils.PageUtils;
import com.mzh.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-20 09:52:28
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

