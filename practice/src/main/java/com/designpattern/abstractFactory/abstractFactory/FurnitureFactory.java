package com.designpattern.abstractFactory.abstractFactory;

import com.designpattern.abstractFactory.abstractProduct.Chair;
import com.designpattern.abstractFactory.abstractProduct.Sofa;

public interface FurnitureFactory {

    public Chair createChair();

    public Sofa createSofa();

}
