package com.xym.dp.designPattern.structure7.composite;

/**
 * 文本框/充当叶子构件
 * 无法处理子组件
 *
 * @author xym
 */
public class TextBoxWidget implements AbstractWidget {

    @Override
    public void display() {
        System.out.println("我是文本框，可以输入数据");
    }

    @Override
    public void add(AbstractWidget widget) {
        System.out.println("暂不支持");
    }

    @Override
    public void remove(AbstractWidget widget) {
        System.out.println("暂不支持");
    }

    @Override
    public AbstractWidget getChild(int i) {
        System.out.println("暂不支持");
        return null;
    }
}