package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Windows类手游建造工厂
 *
 * @author xym
 */
public class WindowsMobileGame implements MobileGame {

    @Override
    public InterfaceController createInterface() {
        return new WindowsInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new WindowsOperationController();
    }
}