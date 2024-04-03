package com.designpatten.abstractFactory;

import java.util.Scanner;

import com.designpatten.abstractFactory.abstractFactory.AbstractFactory;
import com.designpatten.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpatten.abstractFactory.abstractProduct.Chair;
import com.designpatten.abstractFactory.abstractProduct.Sofa;
import com.designpatten.abstractFactory.factory.ClassicFactory;
import com.designpatten.abstractFactory.factory.ConcreteFactory1;
import com.designpatten.abstractFactory.factory.ConcreteFactory2;
import com.designpatten.abstractFactory.factory.ModernFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // testA();

        testB();

    }

    private static void testB() {
        FurnitureFactory modernFactory = new ModernFactory();
        FurnitureFactory classicFactory = new ClassicFactory();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String style = scanner.next();
            Chair chair;
            Sofa sofa;

            switch (style) {
                case "modern":
                    chair = modernFactory.createChair();
                    sofa = modernFactory.createSofa();
                    break;
                case "classical":
                    chair = classicFactory.createChair();
                    sofa = classicFactory.createSofa();
                    break;
                default:
                    System.out.println("error");
                    continue;
            }

            chair.showDescription();
            sofa.showDescription();
        }

        scanner.close();

    }

    private static void testA() {
        AbstractFactory factory1 = new ConcreteFactory1();
        var productA1 = factory1.createProductA();
        var productB1 = factory1.createProductB();
        productA1.display();
        productB1.show();

        AbstractFactory factory2 = new ConcreteFactory2();
        var productA2 = factory2.createProductA();
        var productB2 = factory2.createProductB();
        productA2.display();
        productB2.show();
    }

}
