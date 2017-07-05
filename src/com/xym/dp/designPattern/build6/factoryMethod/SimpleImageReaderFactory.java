package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * 为了使客户端的调用变得简单，也可直接在抽象工厂类上面直接调用抽象产品的方法，屏蔽创建具体产品的过程
 *
 * @author xym
 */
public abstract class SimpleImageReaderFactory {

    public abstract ImageReader createReader();

    public void readImg() {
        ImageReader reader = this.createReader();
        reader.readImg();
    }

}