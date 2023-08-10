package com.lgt.mall.order.feign;

import com.lgt.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="mall-product")
public interface ProductFeign {
    @GetMapping("/product/brand/all")
    public R queryAllBrand();
}