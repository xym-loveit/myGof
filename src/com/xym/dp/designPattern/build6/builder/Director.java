package com.xym.dp.designPattern.build6.builder;

/**
 * 导演，创建指挥者
 *
 * @author xym
 */
public class Director {
    private VideoPlayerBuilder builder;

    public Director(VideoPlayerBuilder builder) {
        this.builder = builder;
    }

    //根据具体的钩子开关，执行相应建造过程
    public VideoPlayer construct() {
        if (builder.isMenu())
            builder.menu();
        if (builder.isControlBar())
            builder.controlBar();
        if (builder.isPlayList())
            builder.playList();
        if (builder.isMainWindows())
            builder.mainWindows();
        return builder.createVideoPlayer();
    }

}