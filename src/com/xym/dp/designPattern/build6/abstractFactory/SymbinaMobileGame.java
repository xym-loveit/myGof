package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Symbina类手游生产工厂
 *
 * @author xym
 */
public class SymbinaMobileGame implements MobileGame {

    @Override
    public InterfaceController createInterface() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new SymbianOperationController();
    }
}