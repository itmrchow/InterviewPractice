package com.designpatten.abstractFactory.product;

import com.designpatten.abstractFactory.abstractProduct.ProductB;

public class ConcreteProductB2 implements ProductB {

    @Override
    public void show() {
        System.out.println("Concrete Product B2");
    }

}
