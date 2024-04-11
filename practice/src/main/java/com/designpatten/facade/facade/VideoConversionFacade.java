package com.designpatten.facade.facade;

import java.io.File;

import com.designpatten.facade.media_lib.AudioMixer;
import com.designpatten.facade.media_lib.BitrateReader;
import com.designpatten.facade.media_lib.Codec;
import com.designpatten.facade.media_lib.CodecFactory;
import com.designpatten.facade.media_lib.Mp4CompressionCodec;
import com.designpatten.facade.media_lib.OggCompressionCodec;
import com.designpatten.facade.media_lib.VideoFile;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {

        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new Mp4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
