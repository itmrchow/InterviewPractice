package com.designpattern.composite;

public class File implements FileSystemComponent {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetail(int level) {
        StringBuilder spaceBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            spaceBuilder.append("   ");
        }
        System.out.println(spaceBuilder.toString() + "檔案: " + name + ", 大小: " + size + " bytes");
    }

}
