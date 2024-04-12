package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpattern.abstractFactory.abstractProduct.Chair;
import com.designpattern.abstractFactory.abstractProduct.Sofa;
import com.designpattern.abstractFactory.product.ClassicChair;
import com.designpattern.abstractFactory.product.ClassicSofa;

public class ClassicFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

}
