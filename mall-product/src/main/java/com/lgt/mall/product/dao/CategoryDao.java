package com.lgt.mall.product.dao;

import com.lgt.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-07 21:31:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
