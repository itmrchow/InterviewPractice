package com.designpatten.abstractFactory.factory;

import com.designpatten.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpatten.abstractFactory.abstractProduct.Chair;
import com.designpatten.abstractFactory.abstractProduct.Sofa;
import com.designpatten.abstractFactory.product.ClassicChair;
import com.designpatten.abstractFactory.product.ClassicSofa;

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
