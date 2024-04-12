package com.designpattern.builder.builder;

import com.designpattern.builder.product.Bike;

public interface BikeBuilder {

    void setFrame();

    void setTires();

    Bike getResult();
}
