package com.lgt.mall.coupon.dao;

import com.lgt.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:20:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
