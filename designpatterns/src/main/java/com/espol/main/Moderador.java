package com.espol.main;

import com.espol.chainofresponsibility.Incident;

public class Moderador extends Usuario {
    private int casosAsignados;
    
    public Moderador(String id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
        this.casosAsignados = 0;
    }
    
    public void revisarIncidente(Incident incident) {
        System.out.println("Moderador " + nombre + " revisando incidente: " + incident.getDescription());
        casosAsignados++;
    }
    
    public int getCasosAsignados() {
        return casosAsignados;
    }
}
