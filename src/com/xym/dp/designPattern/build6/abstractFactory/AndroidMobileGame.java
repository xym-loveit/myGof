package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Android类手游建造工厂，同时生产多类产品
 *
 * @author xym
 */
public class AndroidMobileGame implements MobileGame {

    @Override
    public InterfaceController createInterface() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new AndroidOperationController();
    }
}