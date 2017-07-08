package com.xym.dp.designPattern.structure7.decorator;

/**
 * 具体装饰类
 *
 * @author xym
 */
public class ReverseDecorator extends Decorator {

    public ReverseDecorator(EncryptComponent encryptComponent) {
        super(encryptComponent);
    }

    @Override
    public void encrypt(String target) {
        super.encrypt(target);
        reverseEncrypt(target);
    }

    public void reverseEncrypt(String target) {
        System.out.println("对目标字符 " + target + " 进行逆向输出加密");
    }
}