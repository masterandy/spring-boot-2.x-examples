package com.yi.fallback;

import com.netease.hystrix.dubbo.rpc.filter.Fallback;

/**
 * 回调函数
 * @author YI
 * @date 2018-9-5 21:16:31
 */
public class DemoFallback implements Fallback {

    @Override
    public Object invoke() {
        System.out.println("sayHello 方法回调。。。");
        return null;
    }
}
