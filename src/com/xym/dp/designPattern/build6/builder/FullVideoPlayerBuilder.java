package com.xym.dp.designPattern.build6.builder;

/**
 * 具体建造者实现类--完整模式
 *
 * @author xym
 */
public class FullVideoPlayerBuilder extends VideoPlayerBuilder {

    public FullVideoPlayerBuilder() {
        System.out.println("完整模式");
    }

    @Override
    public void menu() {
        System.out.println("显示菜单");
    }

    @Override
    public void playList() {
        System.out.println("播放列表");
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