package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * desc
 *
 * @author xym
 */
public class GifImageReader implements ImageReader {

    @Override
    public void readImg() {
        System.out.println("读取gif格式图片");
    }
}