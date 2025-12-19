package com.espol.chainofresponsibility;

public class Incident {
    private String id;
    private String description;
    private int severity;
    private boolean resolved;
    
    public Incident(String id, String description, int severity) {
        this.id = id;
        this.description = description;
        this.severity = severity;
        this.resolved = false;
    }
    
    public String getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getSeverity() {
        return severity;
    }
    
    public boolean isResolved() {
        return resolved;
    }
    
    public void markResolved() {
        this.resolved = true;
    }
}
