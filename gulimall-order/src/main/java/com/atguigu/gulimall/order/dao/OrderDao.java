package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaoyu
 * @email 1606539732@qq.com
 * @date 2021-05-16 17:04:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
