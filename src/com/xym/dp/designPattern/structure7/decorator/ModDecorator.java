package com.xym.dp.designPattern.structure7.decorator;

/**
 * 具体装饰类
 *
 * @author xym
 */
public class ModDecorator extends Decorator {

    public ModDecorator(EncryptComponent encryptComponent) {
        super(encryptComponent);
    }

    @Override
    public void encrypt(String target) {
        super.encrypt(target);
        modEncrypt(target);
    }

    public void modEncrypt(String target) {
        System.out.println("对目标字符 " + target + " 进行求模加密");
    }
}