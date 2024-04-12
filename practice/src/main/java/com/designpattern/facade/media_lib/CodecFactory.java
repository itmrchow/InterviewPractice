package com.designpattern.facade.media_lib;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();

        if ("mp4".equals(type)) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new Mp4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }

    }

}
