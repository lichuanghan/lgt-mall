package com.lgt.mall.order.dao;

import com.lgt.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:24:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
