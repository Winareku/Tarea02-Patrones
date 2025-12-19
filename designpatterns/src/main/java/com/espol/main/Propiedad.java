package com.espol.main;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String id;
    private String direccion;
    private Anfitrion anfitrion;
    private List<Unidad> unidades;
    private List<String> reglas;
    
    public Propiedad(String id, String direccion, Anfitrion anfitrion) {
        this.id = id;
        this.direccion = direccion;
        this.anfitrion = anfitrion;
        this.unidades = new ArrayList<>();
        this.reglas = new ArrayList<>();
    }
    
    public void agregarUnidad(Unidad unidad) {
        unidades.add(unidad);
    }
    
    public List<Unidad> getUnidades() {
        return unidades;
    }
    
    public String getId() {
        return id;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public Anfitrion getAnfitrion() {
        return anfitrion;
    }
    
    public List<String> getReglas() {
        return reglas;
    }
    
    public void agregarRegla(String regla) {
        reglas.add(regla);
    }
}
