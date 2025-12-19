package com.espol.strategy;

public class PushNotification implements INotification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando notificación push a " + recipient + ": " + message);
    }
}
