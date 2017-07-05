package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Windows操作系统下的控制
 * 具体实现类
 *
 * @author xym
 */
public class WindowsOperationController implements OperationController{

    @Override
    public void print() {
        System.out.println("Window平台下操作控制器");
    }
}