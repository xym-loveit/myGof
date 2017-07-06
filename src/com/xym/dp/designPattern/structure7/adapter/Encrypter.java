package com.xym.dp.designPattern.structure7.adapter;

import java.security.NoSuchAlgorithmException;

/**
 * 加密器，目标调用类
 * <p>
 * Created by xym on 2017/7/6.
 */
public interface Encrypter {

    //账号加密
    public String digestAccount(String username, String password) throws NoSuchAlgorithmException;

}
