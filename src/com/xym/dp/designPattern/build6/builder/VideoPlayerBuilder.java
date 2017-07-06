package com.xym.dp.designPattern.build6.builder;

/**
 * 抽象建造器
 * 为每一个构建方法提供了钩子方法
 *
 * @author xym
 */
public abstract class VideoPlayerBuilder {

    protected VideoPlayer videoPlayer = new VideoPlayer();


    public boolean isMenu() {
        return true;
    }


    public boolean isPlayList() {
        return true;
    }

    public boolean isMainWindows() {
        return true;
    }


    public void menu() {
        System.out.println("显示菜单");
    }

    public void playList() {
        System.out.println("播放列表");
    }

    public void mainWindows() {
        System.out.println("主窗口");
    }

    public void controlBar() {
        System.out.println("控制条");
    }


    public boolean isControlBar() {
        return true;
    }

    public VideoPlayer createVideoPlayer() {
        return videoPlayer;
    }

}