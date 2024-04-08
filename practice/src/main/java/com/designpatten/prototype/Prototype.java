package com.designpatten.prototype;

public abstract class Prototype implements Cloneable {
    public abstract Prototype clone();

    public abstract String getDetail();

    public Prototype clonePrototype() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
