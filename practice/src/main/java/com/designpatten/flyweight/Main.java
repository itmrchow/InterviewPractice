package com.designpatten.flyweight;

public class Main {
    public static void main(String[] args) {

        String txt = """
                CIRCLE 10 20
                RECTANGLE 30 40
                CIRCLE 15 25
                TRIANGLE 5 15
                CIRCLE 10 20
                RECTANGLE 30 40
                    """;

        ShapeFactory factory = new ShapeFactory();
        txt.lines().forEach(line -> processCommand(factory, line));
    }

    private static void processCommand(ShapeFactory factory, String line) {
        var info = line.split(" ");
        var type = ShapeType.valueOf(info[0]);
        int x = Integer.parseInt(info[1]);
        int y = Integer.parseInt(info[2]);

        var shapes = factory.getShape(type);
        shapes.draw(new Position(x, y));
    }

}
