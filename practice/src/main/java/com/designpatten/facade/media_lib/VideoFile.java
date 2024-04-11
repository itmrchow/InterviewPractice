package com.designpatten.facade.media_lib;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the codecType
     */
    public String getCodecType() {
        return codecType;
    }

}
