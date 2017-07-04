package com.xym.dp.designPattern.build6.simpleFactory;

/**
 * 为了简化，还可以将工厂和抽象产品合并在一起实现简单工厂模式
 *
 * @author xym
 */
public abstract class SimpleShape {

    public static Shape getShape(String stype) throws UnSupportedShapeException {
        if (stype.equals(SHAPEstype.TRIANGLE.name())) {
            return new Triangle();
        } else if (stype.equals(SHAPEstype.RECTANGLE.name())) {
            return new Rectangle();
        } else if (stype.equals(SHAPEstype.CIRCLE.name())) {
            return new Circle();
        } else {
            throw new UnSupportedShapeException("暂不支持该图形绘制[" + stype + "]");
        }
    }


    public static enum SHAPEstype {
        TRIANGLE, RECTANGLE, CIRCLE;
    }

    /**
     * 绘制
     */
    abstract void draw();

    /**
     * 擦除
     */
    abstract void erase();
}