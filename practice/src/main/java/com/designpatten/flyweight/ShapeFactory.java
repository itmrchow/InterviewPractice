package com.designpatten.flyweight;

import java.util.EnumMap;

public class ShapeFactory {
    private EnumMap<ShapeType, Shape> shapes = new EnumMap<>(ShapeType.class);

    public Shape getShape(ShapeType type) {
        if (!shapes.containsKey(type)) {
            shapes.put(type, new ConcreteShape(type));
        }
        return shapes.get(type);
    }
}
