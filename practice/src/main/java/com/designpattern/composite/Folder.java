package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetail(int level) {
        StringBuilder spaceBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            spaceBuilder.append("   ");
        }

        System.out.println(spaceBuilder.toString() + "資料夾:" + name);
        for (FileSystemComponent component : components) {
            component.showDetail(level + 1);
        }
    }

}
