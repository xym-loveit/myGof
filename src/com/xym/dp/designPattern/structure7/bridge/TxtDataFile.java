package com.xym.dp.designPattern.structure7.bridge;

/**
 * 各个抽象类具体子类/也代表一个维度的具体子类
 *
 * @author xym
 */
public class TxtDataFile extends AbstractDataFile {

    public void write() {
        transformImp.export();
        System.out.println("数据导出格式为：" + "Txt");
    }
}