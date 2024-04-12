package com.designpattern.abstractFactory.abstractProduct;

public abstract class Chair {

    public String chairStyle;
    public String chairMaterial;

    public void showDescription() {
        System.out.println(chairStyle + " chair");
    };
}
