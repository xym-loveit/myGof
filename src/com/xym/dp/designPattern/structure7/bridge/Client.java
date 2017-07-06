package com.xym.dp.designPattern.structure7.bridge;

/**
 * 客户端实例，不同数据库导出不同格式的数据，多维度变化
 * 使用桥接模式处理多维度变化场景
 * <p>
 * 正确选中抽象类（一个维度）/实现接口（另一个维度）
 *
 * @author xym
 */
public class Client {

    public static void main(String[] args) {
        AbstractDataFile dataFile = new TxtDataFile();
        dataFile.setTransformImp(new MySqlTransformImp());
        dataFile.write();
    }

}