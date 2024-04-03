package com.designpatten.abstractFactory.abstractFactory;

import com.designpatten.abstractFactory.abstractProduct.ProductA;
import com.designpatten.abstractFactory.abstractProduct.ProductB;

public interface AbstractFactory {
    // Product建構方法
    ProductA createProductA();

    ProductB createProductB();

}
