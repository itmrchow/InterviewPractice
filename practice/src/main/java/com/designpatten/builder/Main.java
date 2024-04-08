package com.designpatten.builder;

import java.util.Scanner;

import com.designpatten.builder.builder.Builder;
import com.designpatten.builder.concreteBuilder.ConcreteBuilder;
import com.designpatten.builder.concreteBuilder.MountainBikeBuilder;
import com.designpatten.builder.concreteBuilder.RoadBikeBuilder;
import com.designpatten.builder.director.BikeDirector;
import com.designpatten.builder.director.Director;

public class Main {
    public static void main(String[] args) {

        main1();

    }

    public static void main1() {
        var mountainBikeBuilder = new MountainBikeBuilder();
        var roadBikeBuilder = new RoadBikeBuilder();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String style = scanner.next();

            switch (style) {
                case "mountain":

                    System.out.println(new BikeDirector().construct(mountainBikeBuilder).toString());
                    break;
                case "road":
                    System.out.println(new BikeDirector().construct(roadBikeBuilder).toString());
                    break;
                default:
                    System.out.println("error");
                    continue;
            }
        }

        scanner.close();

    }

    private static void main2() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();

        var product = builder.getResult();

        System.out.println(product.toString());
    }
}
