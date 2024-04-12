package com.designpattern.builder.product;

public class Bike {
    String frame;
    String tires;

    /**
     * @param frame the frame to set
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * @param tires the tires to set
     */
    public void setTires(String tires) {
        this.tires = tires;
    }

    public String toString() {
        return frame + " " + tires;
    }

}
