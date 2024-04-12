package com.designpattern.observer.sample;

public class SlackSender implements NotificationObserver {

    @Override
    public void sendMsg(String msg) {
        System.out.println("send slack:" + msg);
    }

}
