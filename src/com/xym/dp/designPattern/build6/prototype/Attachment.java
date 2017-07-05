package com.xym.dp.designPattern.build6.prototype;

import java.io.Serializable;

/**
 * 构造一个附件引用对象
 *
 * @author xym
 */
public class Attachment implements Serializable {

    private String name;

    public void download() {
        System.out.println("下载附件，附件名：" + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}