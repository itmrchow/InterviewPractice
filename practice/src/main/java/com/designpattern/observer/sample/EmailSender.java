package com.designpattern.observer.sample;

public class EmailSender implements NotificationObserver {

    @Override
    public void sendMsg(String msg) {
        System.out.println("Send email:" + msg);
    }

}
