package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * Android操作系统下的控制
 * 具体实现类
 *
 * @author xym
 */
public class AndroidOperationController implements OperationController {

    @Override
    public void print() {
        System.out.println("Android平台下操作控制器");
    }
}