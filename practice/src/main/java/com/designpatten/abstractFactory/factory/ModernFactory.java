package com.designpatten.abstractFactory.factory;

import com.designpatten.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpatten.abstractFactory.abstractProduct.Chair;
import com.designpatten.abstractFactory.abstractProduct.Sofa;
import com.designpatten.abstractFactory.product.ModernChair;
import com.designpatten.abstractFactory.product.ModernSofa;

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
