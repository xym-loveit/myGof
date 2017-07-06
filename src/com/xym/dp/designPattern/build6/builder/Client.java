package com.xym.dp.designPattern.build6.builder;

/**
 * 客户端使用调用类
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {

        VideoPlayerBuilder videoPlayerBuilder = new SimplifyVideoPlayerBuilder();
        Director director = new Director(videoPlayerBuilder);

        VideoPlayer construct = director.construct();

    }
}