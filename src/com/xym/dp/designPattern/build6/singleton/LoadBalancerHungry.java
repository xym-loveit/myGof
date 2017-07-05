package com.xym.dp.designPattern.build6.singleton;

/**
 * 饿汉式负载均衡器
 * 类加载时就创建实例，占用了内存空间
 *
 * @author xym
 */
public class LoadBalancerHungry {

    private static LoadBalancerHungry hungry = new LoadBalancerHungry();

    private LoadBalancerHungry() {

    }

    public static LoadBalancerHungry getInstance() {
        return hungry;
    }

}