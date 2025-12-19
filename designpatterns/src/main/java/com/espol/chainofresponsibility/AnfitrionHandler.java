package com.espol.chainofresponsibility;

public class AnfitrionHandler extends IncidentHandler {
    @Override
    protected boolean canHandle(Incident incident) {
        return incident.getSeverity() <= 2;
    }
    
    @Override
    protected void process(Incident incident) {
        System.out.println("Anfitrión manejando incidente: " + incident.getDescription());
        incident.markResolved();
    }
}
