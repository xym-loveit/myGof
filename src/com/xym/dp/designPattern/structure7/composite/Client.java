package com.xym.dp.designPattern.structure7.composite;

/**
 * 使用组合模式实现了对树中节点（叶子结点/容器节点）的一致性处理
 *
 * 该模式根据抽象构建类结构分为：透明组合模式/安全组合模式
 *
 * @author xym
 */
public class Client {

    public static void main(String[] args) {

        AbstractWidget textbox, window, button, panel;
        window = new WindowsWidget();
        button = new ButtonWidget();
        panel = new PanelWidget();
        textbox = new TextBoxWidget();

        window.add(button);
        window.add(panel);
        panel.add(textbox);

        window.display();
    }

}