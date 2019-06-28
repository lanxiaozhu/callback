package com.example.demo.callbak.handler;

import com.example.demo.callbak.service.Customer;
import org.springframework.stereotype.Component;

/**
 * @Auther: wishm
 * @Date: 2019/6/28 16:04
 * @Description: 中介
 */
@Component
public class Intermediary {

    /**
     * 询问 晒寻房源
     * @param customer
     * @param condition
     */
    public void ask(Customer customer, String condition){
        try {
            Thread.sleep(1000);
            System.out.println("----中介：找呀找呀找朋友 找到一个好朋友---");
        } catch (InterruptedException e) {
            e.printStackTrace();
            customer.location("业务执行异常"+"  大哥我这边電腦坏了！");
        }

        //找到合适房源，返回结果
        String house = "楼王户型符合条件，武动乾坤1-3-301房";
        customer.location(house);


    }
}
