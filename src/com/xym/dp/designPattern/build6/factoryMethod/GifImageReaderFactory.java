package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * desc
 *
 * @author xym
 */
public class GifImageReaderFactory extends ImageReaderFactory {

    @Override
    public ImageReader createReader() {
        return new GifImageReader();
    }
}