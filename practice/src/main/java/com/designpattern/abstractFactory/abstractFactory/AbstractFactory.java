package com.designpattern.abstractFactory.abstractFactory;

import com.designpattern.abstractFactory.abstractProduct.ProductA;
import com.designpattern.abstractFactory.abstractProduct.ProductB;

public interface AbstractFactory {
    // Product建構方法
    ProductA createProductA();

    ProductB createProductB();

}
