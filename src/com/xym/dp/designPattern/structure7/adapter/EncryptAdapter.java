package com.xym.dp.designPattern.structure7.adapter;

import java.security.NoSuchAlgorithmException;

/**
 * 加密适配器:对象适配器
 * <p>
 * 适配器分为对象适配器模式和类适配器模式，其中类适配器模式为适配器和适配者之前是继承关系，而对象适配器模式是适配器和适配者是关联关系
 *
 * @author xym
 */
public class EncryptAdapter implements Encrypter {

    //适配者，和当前适配器之间是关联关系,可以注入多个
    private PasswdEncrypt passwdEncrypt;

    public EncryptAdapter() {
        passwdEncrypt = new PasswdEncrypt();
    }

    //通过调用适配者方法，达到 方法调用兼用
    @Override
    public String digestAccount(String username, String passwd) throws NoSuchAlgorithmException {
        return passwdEncrypt.encrypt(username, passwd);
    }
}