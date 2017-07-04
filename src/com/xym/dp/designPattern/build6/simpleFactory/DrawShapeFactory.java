package com.xym.dp.designPattern.build6.simpleFactory;

/**
 * desc
 *
 * @author xym
 */
public class DrawShapeFactory {

    public static Shape getShape(String type) throws UnSupportedShapeException {
        if (type.equals(SHAPETYPE.TRIANGLE.name())) {
            return new Triangle();
        } else if (type.equals(SHAPETYPE.RECTANGLE.name())) {
            return new Rectangle();
        } else if (type.equals(SHAPETYPE.CIRCLE.name())) {
            return new Circle();
        } else {
            throw new UnSupportedShapeException("暂不支持该图形绘制[" + type + "]");
        }
    }


    public static enum SHAPETYPE {
        TRIANGLE, RECTANGLE, CIRCLE;
    }
}