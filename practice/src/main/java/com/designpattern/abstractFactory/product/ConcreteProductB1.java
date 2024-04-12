package com.designpattern.abstractFactory.product;

import com.designpattern.abstractFactory.abstractProduct.ProductB;

public class ConcreteProductB1 implements ProductB {

    @Override
    public void show() {
        System.out.println("Concrete Product B1");
    }

}
