package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpattern.abstractFactory.abstractProduct.Chair;
import com.designpattern.abstractFactory.abstractProduct.Sofa;
import com.designpattern.abstractFactory.product.ModernChair;
import com.designpattern.abstractFactory.product.ModernSofa;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
