package com.designpatten.abstractFactory.factory;

import com.designpatten.abstractFactory.abstractFactory.AbstractFactory;
import com.designpatten.abstractFactory.abstractProduct.ProductA;
import com.designpatten.abstractFactory.abstractProduct.ProductB;
import com.designpatten.abstractFactory.product.ConcreteProductA1;
import com.designpatten.abstractFactory.product.ConcreteProductB1;

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
