package com.designpatten.abstractFactory.abstractProduct;

public abstract class Sofa {

    public String sofaStyle;
    public String sofaMaterial;

    public void showDescription() {
        System.out.println(sofaStyle + " sofa");
    };

}
