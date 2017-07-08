package com.xym.dp.designPattern.structure7.decorator;

/**
 * 对客户端使用完全透明装饰模式，实现具体构件的功能扩展
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {
        //一致使用抽象构建类
        EncryptComponent shiftComponent, modComponent, reverseComponent;
        //具体构件类实例化
        shiftComponent = new ShiftEncryptComponent();


    //具体装饰类实例化
    modComponent = new ModDecorator(shiftComponent);
    //具体装饰类实例化，对进行过一次装饰的具体构件进行二次装饰
    reverseComponent = new ReverseDecorator(modComponent);
        reverseComponent.encrypt("admin");
}
}