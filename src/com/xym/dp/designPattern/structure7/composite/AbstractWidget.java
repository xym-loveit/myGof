package com.xym.dp.designPattern.structure7.composite;

/**
 * 抽象构件接口
 * Created by xym on 2017/7/7.
 */
public interface AbstractWidget {

    //子类共有的行为,业务方法
    public void display();

    //添加成员
    public void add(AbstractWidget widget);

    //删除成员
    public void remove(AbstractWidget widget);

    //获取成员
    public AbstractWidget getChild(int i);
}
