package com.designpattern.observer.base;

public interface Subject {
    // 註冊
    void registerObserver(Observer observer);
    // 刪除
    void removeObserver(Observer observer);
    // 通知
    void notifyObservers();
}
