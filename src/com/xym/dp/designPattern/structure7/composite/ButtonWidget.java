package com.xym.dp.designPattern.structure7.composite;

/**
 * 按钮/充当叶子构件
 * 无法处理子组件
 *
 * @author xym
 */
public class ButtonWidget implements AbstractWidget {

    @Override
    public void display() {
        System.out.println("我是按钮，可以点击");
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