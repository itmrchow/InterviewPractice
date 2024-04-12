package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.abstractFactory.AbstractFactory;
import com.designpattern.abstractFactory.abstractProduct.ProductA;
import com.designpattern.abstractFactory.abstractProduct.ProductB;
import com.designpattern.abstractFactory.product.ConcreteProductA1;
import com.designpattern.abstractFactory.product.ConcreteProductB1;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }

}
