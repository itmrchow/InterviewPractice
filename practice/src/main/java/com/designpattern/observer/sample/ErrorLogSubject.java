package com.designpattern.observer.sample;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogSubject implements LogEvanSubject{

    private List<NotificationObserver> observerList = new ArrayList<>();

    private String errorMessage = "Error message";

    @Override
    public void registerObserver(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationObserver notificationObserver : observerList) {
            notificationObserver.sendMsg(errorMessage);
        }
    }

    
}
