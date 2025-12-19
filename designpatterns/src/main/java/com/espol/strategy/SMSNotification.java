package com.espol.strategy;

public class SMSNotification implements INotification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando SMS a " + recipient + ": " + message);
    }
}
