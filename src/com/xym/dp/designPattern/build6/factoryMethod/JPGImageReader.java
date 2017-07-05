package com.xym.dp.designPattern.build6.factoryMethod;

/**
 * desc
 *
 * @author xym
 */
public class JPGImageReader implements ImageReader {

    @Override
    public void readImg() {
        System.out.println("读取jpg格式图片");
    }
}