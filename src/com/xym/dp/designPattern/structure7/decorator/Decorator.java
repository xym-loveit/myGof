package com.xym.dp.designPattern.structure7.decorator;

/**
 * 抽象装饰类
 *
 * @author xym
 */
public class Decorator implements EncryptComponent {

    //持有抽象构件类的引用
    private EncryptComponent encryptComponent;

    public Decorator(EncryptComponent encryptComponent) {
        this.encryptComponent = encryptComponent;
    }

    //默认执行具体构建类方法
    @Override
    public void encrypt(String target) {
        encryptComponent.encrypt(target);
    }
}