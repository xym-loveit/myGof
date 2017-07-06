package com.xym.dp.designPattern.build6.builder;

/**
 * 视频播放
 *
 * @author xym
 */
public class VideoPlayer {

    private String menu;//显示菜单
    private String playList;//播放列表
    private String mainWindows;//主窗口
    private String controlBar;//控制条

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindows() {
        return mainWindows;
    }

    public void setMainWindows(String mainWindows) {
        this.mainWindows = mainWindows;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }
}