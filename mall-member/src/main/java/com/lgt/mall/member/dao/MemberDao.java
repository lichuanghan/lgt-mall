package com.lgt.mall.member.dao;

import com.lgt.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:23:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
