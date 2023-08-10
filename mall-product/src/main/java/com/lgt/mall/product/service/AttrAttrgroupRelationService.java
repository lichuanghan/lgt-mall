package com.lgt.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgt.mall.common.utils.PageUtils;
import com.lgt.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-07 21:31:45
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

