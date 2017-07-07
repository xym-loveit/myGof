package com.xym.dp.designPattern.structure7.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 面板/充当容器构件
 * 容器里面可以再包含容器或叶子组件
 *
 * @author xym
 */
public class PanelWidget implements AbstractWidget {

    private List<AbstractWidget> widgets = new ArrayList<AbstractWidget>();

    @Override
    public void display() {
        System.out.println("----我是面板，我可以容纳其他组件----");
        if (!widgets.isEmpty()) {
            for (AbstractWidget widget : widgets) {
                widget.display();
            }
        }
    }

    @Override
    public void add(AbstractWidget widget) {
        widgets.add(widget);
    }

    @Override
    public void remove(AbstractWidget widget) {
        widgets.remove(widget);
    }

    @Override
    public AbstractWidget getChild(int i) {
        return widgets.get(i);
    }
}