package com.xym.dp.designPattern.structure7.decorator;

/**
 * 移位加密构件：具体构件类
 *
 * @author xym
 */
public class ShiftEncryptComponent implements EncryptComponent {

    @Override
    public void encrypt(String target) {
        System.out.println("对目标字符 " + target + " 进行移位加密");
    }
}