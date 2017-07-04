package com.xym.dp.OOPrinciple.interfacesegp;

/**
 * 重构后发现只需要选择性实现需要的细粒度接口即可,不会遭到绑架
 * 将一个大接口提取为若干个单一职责的小接口，遵守了接口隔离原则
 *
 * @author xym
 */
public class ConcreteClass implements DataHandler, ChartHandler {

    @Override
    public void dataRead() {

    }


    @Override
    public void createChart() {

    }

    @Override
    public void displayChart() {

    }

}