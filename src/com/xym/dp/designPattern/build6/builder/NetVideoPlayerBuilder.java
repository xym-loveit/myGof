package com.xym.dp.designPattern.build6.builder;

/**
 * desc
 *
 * @author xym
 */
public class NetVideoPlayerBuilder extends VideoPlayerBuilder {

    public NetVideoPlayerBuilder() {
        System.out.println("网络模式");
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
    public boolean isControlBar() {
        return false;
    }
}