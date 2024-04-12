package com.designpattern.observer.sample;

public interface LogEvanSubject {
    // 註冊
    void registerObserver(NotificationObserver observer);
    // 刪除
    void removeObserver(NotificationObserver observer);
    // 通知
    void notifyObservers();

    
} 
