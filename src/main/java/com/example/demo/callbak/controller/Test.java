package com.example.demo.callbak.controller;

import com.example.demo.callbak.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wishm
 * @Date: 2019/6/28 16:25
 * @Description:
 */
@RestController
public class Test {

    @Autowired
    private Restaurant customer_restaurant;


    @RequestMapping("/get")
    public String exec() {
        customer_restaurant.exec("我要楼王");
        return "ok";
    }
}
