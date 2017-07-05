package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * 抽象工厂类,定义了创建抽象产品的接口
 *
 * @author xym
 */
public abstract class ImageReaderFactory {

    public abstract ImageReader createReader();

}