package com.designpattern.observer.base;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSub implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(status);
        }
    }

    public void updateStatus(String status){
        this.status = status;
    }
    
}
