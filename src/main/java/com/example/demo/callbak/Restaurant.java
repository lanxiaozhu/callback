package com.example.demo.callbak;

/**
 * @Auther: wishm
 * @Date: 2019/6/28 15:55
 * @Description: 回调接口  餐馆
 */
public interface Restaurant {

    void exec(String condition);


    /**
     * 回调方法 餐馆位置
     * @param resource 结果
     */
    void location(String resource);
}
