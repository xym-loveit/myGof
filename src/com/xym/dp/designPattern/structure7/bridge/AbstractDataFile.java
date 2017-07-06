package com.xym.dp.designPattern.structure7.bridge;

/**
 * 抽象数据文件类:抽象类/代表一个维度的根
 *
 * @author xym
 */
public abstract class AbstractDataFile {

    //应用了实现接口：维护2层等级结构抽象关联关系,注意这里的访问修饰符为protected
    protected DBTransformImp transformImp;

    public void setTransformImp(DBTransformImp transformImp) {
        this.transformImp = transformImp;
    }

    public abstract void write();
}