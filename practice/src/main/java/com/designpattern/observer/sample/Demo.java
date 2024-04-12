package com.designpattern.observer.sample;

public class Demo {
    public static void main(String[] args) {
        ErrorLogSubject subject = new ErrorLogSubject();
        subject.registerObserver(new EmailSender());
        subject.registerObserver(new SlackSender());

        subject.notifyObservers();

    }
}
