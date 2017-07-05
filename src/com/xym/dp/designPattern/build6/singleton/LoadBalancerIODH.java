package com.xym.dp.designPattern.build6.singleton;

/**
 * Initialization Demand Holder (IoDH)
 * 延迟创建单一实例，且性能也得到了保障
 * 次实例化方式最好
 *
 * @author xym
 */
public class LoadBalancerIODH {


    public static void main(String[] args) {
        LoadBalancerIODH loadBalancerIODH1 = LoadBalancerIODH.getInstance();
        LoadBalancerIODH loadBalancerIODH2 = LoadBalancerIODH.getInstance();
        LoadBalancerIODH loadBalancerIODH3 = LoadBalancerIODH.getInstance();

        System.out.println(loadBalancerIODH1 == loadBalancerIODH2 && loadBalancerIODH1 == loadBalancerIODH3 && loadBalancerIODH2 == loadBalancerIODH3);
    }

    private LoadBalancerIODH() {
    }

    public static LoadBalancerIODH getInstance() {
        return HolderClass.loadBalancerIODH;
    }

    private static class HolderClass {
        private static LoadBalancerIODH loadBalancerIODH = new LoadBalancerIODH();
    }
}