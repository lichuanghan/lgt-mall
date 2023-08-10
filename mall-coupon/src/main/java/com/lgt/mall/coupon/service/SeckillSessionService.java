package com.lgt.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgt.mall.common.utils.PageUtils;
import com.lgt.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:20:15
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

