package com.xym.dp.designPattern.build6.singleton;

/**
 * desc
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancerHungry instance2 = LoadBalancerHungry.getInstance();
        LoadBalancerHungry instance1 = LoadBalancerHungry.getInstance();
        LoadBalancerHungry instance3 = LoadBalancerHungry.getInstance();
        System.out.println((instance1 == instance2) && (instance3 == instance2) && (instance1 == instance3));

    }
}