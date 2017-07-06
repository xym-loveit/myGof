package com.xym.dp.designPattern.build6.builder;

/**
 * 具体建造者实现类--记忆模式
 *
 * @author xym
 */
public class MemoryVideoPlayerBuilder extends VideoPlayerBuilder {

    public MemoryVideoPlayerBuilder() {
        System.out.println("记忆模式");
    }


    @Override
    public boolean isMenu() {
        return false;
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