package com.xym.dp.designPattern.build6.builder;

/**
 * 具体建造者实现类--精简模式
 *
 * @author xym
 */
public class SimplifyVideoPlayerBuilder extends VideoPlayerBuilder {

    public SimplifyVideoPlayerBuilder() {
        System.out.println("精简模式");
    }

    @Override
    public boolean isMenu() {
        return false;
    }

    @Override
    public boolean isPlayList() {
        return false;
    }

    @Override
    public void mainWindows() {
        System.out.println("主窗口");
    }

    @Override
    public void controlBar() {
        System.out.println("控制条");
    }

}