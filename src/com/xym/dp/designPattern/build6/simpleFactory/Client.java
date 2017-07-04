package com.xym.dp.designPattern.build6.simpleFactory;

/**
 * desc
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = DrawShapeFactory.getShape("RECTANGLE");
        shape.draw();
        shape.erase();
    }
}