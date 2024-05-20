package com.mzh.coupon.dao;

import com.mzh.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-20 09:52:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
