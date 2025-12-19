package com.espol.main;

import java.util.ArrayList;
import java.util.List;

public class Anfitrion extends Usuario {
    private List<Propiedad> propiedades;
    private double calificacion;
    
    public Anfitrion(String id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
        this.propiedades = new ArrayList<>();
        this.calificacion = 5.0;
    }
    
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
    
    public List<Propiedad> getPropiedades() {
        return propiedades;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
