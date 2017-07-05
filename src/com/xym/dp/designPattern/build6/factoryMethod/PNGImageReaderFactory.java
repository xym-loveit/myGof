package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * desc
 *
 * @author xym
 */
public class PNGImageReaderFactory extends ImageReaderFactory {

    @Override
    public ImageReader createReader() {
        return new PNGImageReader();
    }
}