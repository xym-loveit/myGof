package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * 这里我们可以把各个不同操作系统平台下的同一类事物，比如：手游控制器称为 概念中的一个产品等级
 * <p>
 * 将一个windows下面的控制器和界面称为同一个产品族
 * <p>
 * 即产品族是不同类型的事物的统称（海尔电视剧、海尔电冰箱、海尔洗衣机等）
 * <p>
 * 产品等级是同一类事物的统称（如海尔电视机、长虹电视剧、TCL电视机等）
 * <p>
 * 产品族的扩展很方便，但如果想添加产品等级则需要修改之前的代码，会破坏开闭原则
 * <p>
 * 这种模式下的创建可以使用抽象工厂模式
 *
 * @author xym
 */
public class Client {

    public static void main(String[] args) {

        MobileGame androidMobileGame = new WindowsMobileGame();
        InterfaceController anInterface = androidMobileGame.createInterface();
        OperationController operation = androidMobileGame.createOperation();
        anInterface.print();
        operation.print();
    }

}