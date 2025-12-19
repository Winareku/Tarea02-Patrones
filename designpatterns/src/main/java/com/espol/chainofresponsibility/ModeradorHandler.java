package com.espol.chainofresponsibility;

public class ModeradorHandler extends IncidentHandler {
    @Override
    protected boolean canHandle(Incident incident) {
        return incident.getSeverity() > 2 && incident.getSeverity() <= 5;
    }
    
    @Override
    protected void process(Incident incident) {
        System.out.println("Moderador manejando incidente: " + incident.getDescription());
        incident.markResolved();
    }
}
