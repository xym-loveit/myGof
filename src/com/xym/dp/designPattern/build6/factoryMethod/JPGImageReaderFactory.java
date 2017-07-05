package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * 具体工厂类负责生产产品实现类的实例
 *
 * @author xym
 */
public class JPGImageReaderFactory extends ImageReaderFactory {

    @Override
    public ImageReader createReader() {
        return new JPGImageReader();
    }
}