package com.xym.dp.designPattern.structure7.bridge;

/**
 * 具体实现者，实现了实现接口中方法/代表另一个维度的具体子类
 *
 * @author xym
 */
public class OracleTransformImp implements DBTransformImp {

    @Override
    public void export() {
        System.out.println("导出Oracle数据库数据");
    }
}