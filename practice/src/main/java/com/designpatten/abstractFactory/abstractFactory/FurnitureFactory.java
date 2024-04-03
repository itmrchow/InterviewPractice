package com.designpatten.abstractFactory.abstractFactory;

import com.designpatten.abstractFactory.abstractProduct.Chair;
import com.designpatten.abstractFactory.abstractProduct.Sofa;

public interface FurnitureFactory {

    public Chair createChair();

    public Sofa createSofa();

}
