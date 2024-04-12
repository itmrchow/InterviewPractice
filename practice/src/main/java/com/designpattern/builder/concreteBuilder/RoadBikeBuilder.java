package com.designpattern.builder.concreteBuilder;

import com.designpattern.builder.builder.BikeBuilder;
import com.designpattern.builder.product.Bike;

public class RoadBikeBuilder implements BikeBuilder {

    private Bike bike = new Bike();

    @Override
    public void setFrame() {
        bike.setFrame("Carbon Frame");
    }

    @Override
    public void setTires() {
        bike.setTires("Slim Tries");
    }

    @Override
    public Bike getResult() {
        return bike;
    }

}
