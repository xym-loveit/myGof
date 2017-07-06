package com.xym.dp.designPattern.structure7.adapter;

import java.security.NoSuchAlgorithmException;

/**
 * 客户端调用
 *
 * @author xym
 */
public class Client {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        //使用适配器模式将原本不兼容的结构的方法调用协同起来
        Encrypter encrypter = new EncryptAdapter();
        String account = encrypter.digestAccount("zhangsan", "123456");

        System.out.println(account);
    }

}