package com.designpattern.abstractFactory.abstractProduct;

public abstract class Sofa {

    public String sofaStyle;
    public String sofaMaterial;

    public void showDescription() {
        System.out.println(sofaStyle + " sofa");
    };

}
