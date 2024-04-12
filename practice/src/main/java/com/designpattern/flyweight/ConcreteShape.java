package com.designpattern.flyweight;

public class ConcreteShape implements Shape {
    private boolean isFirstTime = true;
    private ShapeType shapeType;

    public ConcreteShape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public void draw(Position position) {
        System.out.println(shapeType + (isFirstTime ? " drawn" : " shared") + " at (" + position.getX() + ", "
                + position.getY() + ")");

        this.isFirstTime = false;
    }

}
