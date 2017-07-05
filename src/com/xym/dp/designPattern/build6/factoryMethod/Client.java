package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * 工厂方法模式客户端
 * <p>
 * 采用将产品类、创建工厂类都抽象化编程，具体产品使用具体工厂生产，对外提供一致的产品对象，如果要扩展一种类型，只需要开发具体产品类及具体生产工厂，对原有的代码不产生任何改动，符合开闭原则
 * <p>
 * 工厂方法模式只能用来解决同类事物，每个具体事物要对应一个工厂
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {

        //ImageReaderFactory factory = new PNGImageReaderFactory();
        //ImageReader reader = factory.createReader();
        //reader.readImg();

    }
}