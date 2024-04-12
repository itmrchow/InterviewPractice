package com.designpattern.facade.facade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        // client對外觀進行操作
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
