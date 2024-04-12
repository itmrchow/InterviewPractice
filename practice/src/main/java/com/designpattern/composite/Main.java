package com.designpattern.composite;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("根目錄");

        File file1 = new File("檔案1.txt", 1024);
        File file2 = new File("檔案2.pdf", 2048);
        Folder folder1 = new Folder("資料夾1");
        File file3 = new File("檔案3.doc", 512);

        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(folder1);
        folder1.addComponent(file3);

        root.showDetail(0);

    }
}
