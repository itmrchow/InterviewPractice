package com.designpatten.abstractFactory.factory;

import com.designpatten.abstractFactory.abstractFactory.AbstractFactory;
import com.designpatten.abstractFactory.abstractProduct.ProductA;
import com.designpatten.abstractFactory.abstractProduct.ProductB;
import com.designpatten.abstractFactory.product.ConcreteProductA2;
import com.designpatten.abstractFactory.product.ConcreteProductB2;

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
