package com.designpattern.observer.base;

public class ConcreteObs implements Observer {

    @Override
    public void update(String message) {
        System.out.println("observer show message:" + message);
    }

}
