package com.espol.chainofresponsibility;

public abstract class IncidentHandler {
    protected IncidentHandler nextHandler;
    
    public IncidentHandler setNext(IncidentHandler handler) {
        this.nextHandler = handler;
        return handler;
    }
    
    public void handleIncident(Incident incident) {
        if (canHandle(incident)) {
            process(incident);
        } else if (nextHandler != null) {
            nextHandler.handleIncident(incident);
        }
    }
    
    protected abstract boolean canHandle(Incident incident);
    protected abstract void process(Incident incident);
}