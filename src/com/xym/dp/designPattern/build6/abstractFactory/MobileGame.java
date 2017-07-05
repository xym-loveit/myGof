package com.xym.dp.designPattern.build6.abstractFactory;

/**
 * 同一产品族游戏界面和操作抽象工厂
 * <p>
 * Created by xym on 2017/7/5.
 */
public interface MobileGame {

    /**
     * 游戏界面生成器
     *
     * @return
     */
    public InterfaceController createInterface();

    /**
     * 游戏操作生成器
     *
     * @return
     */
    public OperationController createOperation();


}
