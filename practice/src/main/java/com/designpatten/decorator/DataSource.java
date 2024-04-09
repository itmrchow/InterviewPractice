package com.designpatten.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();

}
