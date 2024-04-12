package com.designpattern.builder.director;

import com.designpattern.builder.builder.BikeBuilder;
import com.designpattern.builder.product.Bike;

public class BikeDirector {

    public Bike construct(BikeBuilder builder) {
        builder.setFrame();
        builder.setTires();

        return builder.getResult();
    }

}
