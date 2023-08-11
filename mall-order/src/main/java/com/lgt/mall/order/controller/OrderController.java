package com.lgt.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import com.lgt.mall.order.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.lgt.mall.order.entity.OrderEntity;
import com.lgt.mall.order.service.OrderService;
import com.lgt.mall.common.utils.PageUtils;
import com.lgt.mall.common.utils.R;



/**
 * 订单
 *
 * @author lgt
 * @email leeetaooo@gmail.com
 * @date 2023-08-08 07:24:23
 */
@RefreshScope
@RestController
@RequestMapping("order/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductFeign productFeign;
    @Value("${user.uname}")
    private String userName;
    @Value("${user.uage}")
    private String userAge;
    @GetMapping("/users")
    public R ueryUser(){
        return R.ok().put("username",userName).put("userAge",userAge);
    }
    @GetMapping("/products")
    public R queryAllProduct(){
        return R.ok().put("products",productFeign.queryAllBrand());
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order){
		orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order){
		orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
