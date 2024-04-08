package com.designpatten.builder.director;

import com.designpatten.builder.builder.BikeBuilder;
import com.designpatten.builder.product.Bike;

public class BikeDirector {

    public Bike construct(BikeBuilder builder) {
        builder.setFrame();
        builder.setTires();

        return builder.getResult();
    }

}
