package com.designpatten.abstractFactory.product;

import com.designpatten.abstractFactory.abstractProduct.ProductB;

public class ConcreteProductB1 implements ProductB {

    @Override
    public void show() {
        System.out.println("Concrete Product B1");
    }

}
