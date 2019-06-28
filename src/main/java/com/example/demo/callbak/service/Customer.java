package com.example.demo.callbak.service;

import com.example.demo.callbak.Restaurant;
import com.example.demo.callbak.handler.Intermediary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: wishm
 * @Date: 2019/6/28 15:57
 * @Description: 1、实现回调接口 2、持有对象的引用 3、调用 intermediary中介方法，携带自身对象this,方便回调
 */
@Service("customer_restaurant")
public class Customer implements Restaurant {

    @Resource
    private Intermediary intermediary;


    public void exec(String condition){
        //询问中介 根据条件筛选
        new Thread( ()-> {
            intermediary.ask(this,condition);
        }).start();


        System.out.println("----------我吃饭去了，筛选完成后记得去餐馆找我---------");

    }
    /**
     *
     * @param resource 筛选结果
     */
    @Override
    public void location(String resource) {
        System.out.println(resource);
    }
}
