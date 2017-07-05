package com.xym.dp.designPattern.build6.singleton;

/**
 * 懒汉式负载均衡器
 * 用到的时候才会创建实例
 * 使用锁机制，降低了程序执行效率
 *
 * @author xym
 */
public class LoadBalancerLazy {

    //使用volatile,直接写回主内存 保障线程可见性
    private volatile static LoadBalancerLazy loadBalancerLazy = null;


    private LoadBalancerLazy() {
    }

    //采用同步代码块，提高性能
    public static LoadBalancerLazy getInstance() {
        if (loadBalancerLazy == null) {
            synchronized (LoadBalancerLazy.class) {
                //双重检查，防止多线程创建多实例
                if (loadBalancerLazy == null) {
                    loadBalancerLazy = new LoadBalancerLazy();
                }
            }
        }
        return loadBalancerLazy;
    }

}