package com.designpatten.builder.builder;

import com.designpatten.builder.product.Bike;

public interface BikeBuilder {

    void setFrame();

    void setTires();

    Bike getResult();
}
