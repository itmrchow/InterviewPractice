package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.abstractFactory.AbstractFactory;
import com.designpattern.abstractFactory.abstractProduct.ProductA;
import com.designpattern.abstractFactory.abstractProduct.ProductB;
import com.designpattern.abstractFactory.product.ConcreteProductA2;
import com.designpattern.abstractFactory.product.ConcreteProductB2;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }

}
