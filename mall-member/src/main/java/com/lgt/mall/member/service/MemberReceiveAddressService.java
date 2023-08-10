package com.lgt.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lgt.mall.common.utils.PageUtils;
import com.lgt.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:23:03
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

