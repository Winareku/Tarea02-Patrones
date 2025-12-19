package com.espol.singleton;

import com.espol.strategy.INotification;
import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private static NotificationManager instance;
    private List<INotification> notifiers;
    
    private NotificationManager() {
        this.notifiers = new ArrayList<>();
    }
    
    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }
    
    public void addNotifier(INotification notifier) {
        notifiers.add(notifier);
    }
    
    public void removeNotifier(INotification notifier) {
        notifiers.remove(notifier);
    }
    
    public void sendNotification(String message, String recipient) {
        for (INotification notifier : notifiers) {
            notifier.send(message, recipient);
        }
    }
}