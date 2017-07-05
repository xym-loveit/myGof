package com.xym.dp.designPattern.build6.singleton;

/**
 * 使用枚举实现的单例才是最好的
 *
 * @author xym
 */
public class LoadBalancerEnum {

    private LoadBalancerEnum() {
    }

    public static LoadBalancerEnum getInstance() {
        return INSTANCE.INSTANCE.getInstance();
    }

    private static enum INSTANCE {
        INSTANCE;

        private LoadBalancerEnum instance;

        INSTANCE() {
            instance = new LoadBalancerEnum();
        }


        public LoadBalancerEnum getInstance() {
            return instance;
        }

    }


}