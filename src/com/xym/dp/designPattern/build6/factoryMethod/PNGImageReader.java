package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * desc
 *
 * @author xym
 */
public class PNGImageReader implements ImageReader {

    @Override
    public void readImg() {
        System.out.println("读取png格式图片");
    }
}