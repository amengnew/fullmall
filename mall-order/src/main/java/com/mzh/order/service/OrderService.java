package com.mzh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mzh.common.utils.PageUtils;
import com.mzh.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-20 10:42:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

