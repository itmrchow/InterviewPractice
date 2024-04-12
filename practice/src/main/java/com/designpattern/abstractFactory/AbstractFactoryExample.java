package com.designpattern.abstractFactory;

import java.util.Scanner;

import com.designpattern.abstractFactory.abstractFactory.AbstractFactory;
import com.designpattern.abstractFactory.abstractFactory.FurnitureFactory;
import com.designpattern.abstractFactory.abstractProduct.Chair;
import com.designpattern.abstractFactory.abstractProduct.Sofa;
import com.designpattern.abstractFactory.factory.ClassicFactory;
import com.designpattern.abstractFactory.factory.ConcreteFactory1;
import com.designpattern.abstractFactory.factory.ConcreteFactory2;
import com.designpattern.abstractFactory.factory.ModernFactory;

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
