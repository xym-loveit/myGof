package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Symbian操作系统下的操作控制
 * 具体实现类
 *
 * @author xym
 */
public class SymbianOperationController implements OperationController{

    @Override
    public void print() {
        System.out.println("Symbian平台下操作控制器");
    }
}