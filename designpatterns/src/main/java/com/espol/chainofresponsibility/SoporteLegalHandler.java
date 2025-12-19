package com.espol.chainofresponsibility;

public class SoporteLegalHandler extends IncidentHandler {
    @Override
    protected boolean canHandle(Incident incident) {
        return incident.getSeverity() > 5;
    }
    
    @Override
    protected void process(Incident incident) {
        System.out.println("Soporte Legal manejando incidente: " + incident.getDescription());
        incident.markResolved();
    }
}