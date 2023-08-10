package com.lgt.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgt.mall.common.utils.PageUtils;
import com.lgt.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:23:03
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

