package com.espol.strategy;

public class EmailNotification implements INotification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando email a " + recipient + ": " + message);
    }
}
