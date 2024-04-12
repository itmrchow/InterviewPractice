package com.designpattern.builder.concreteBuilder;

import com.designpattern.builder.builder.BikeBuilder;
import com.designpattern.builder.product.Bike;

public class MountainBikeBuilder implements BikeBuilder {
    private Bike bike = new Bike();

    @Override
    public void setFrame() {
        bike.setFrame("Aluminum Frame");
    }

    @Override
    public void setTires() {
        bike.setTires("Knobby Tires");
    }

    @Override
    public Bike getResult() {
        return bike;
    }

}
