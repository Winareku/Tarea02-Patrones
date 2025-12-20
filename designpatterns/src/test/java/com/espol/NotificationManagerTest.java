package com.espol;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.singleton.*;
import com.espol.strategy.*;

class NotificationManagerTest {
    
    @Test
    @DisplayName("Verificar patrón Singleton")
    void testSingletonInstance() {
        NotificationManager instance1 = NotificationManager.getInstance();
        NotificationManager instance2 = NotificationManager.getInstance();
        assertEquals(instance1, instance2);
    }
    
    @Test
    @DisplayName("Enviar notificación correctamente")
    void testSendNotification() {
        NotificationManager manager = NotificationManager.getInstance();
        
        boolean[] wasCalled = {false};
        INotification testNotifier = new INotification() {
            @Override
            public void send(String message, String recipient) {
                wasCalled[0] = true;
            }
        };
        
        manager.addNotifier(testNotifier);
        manager.sendNotification("Mensaje", "destino");
        
        assertTrue(wasCalled[0]);
    }
}