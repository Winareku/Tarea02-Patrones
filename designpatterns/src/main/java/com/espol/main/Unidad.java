package com.espol.main;

import com.espol.factorymethod.IUnidad;
import com.espol.main.enums.*;

public class Unidad {
    private String id;
    private EstadoUnidad estado;
    private IUnidad unidadTipo;
    private Propiedad propiedad;
    
    public Unidad(String id, IUnidad unidadTipo, Propiedad propiedad) {
        this.id = id;
        this.unidadTipo = unidadTipo;
        this.propiedad = propiedad;
        this.estado = EstadoUnidad.DISPONIBLE;
    }
    
    public String getId() {
        return id;
    }
    
    public EstadoUnidad getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoUnidad estado) {
        this.estado = estado;
    }
    
    public IUnidad getUnidadTipo() {
        return unidadTipo;
    }
    
    public Propiedad getPropiedad() {
        return propiedad;
    }
}
