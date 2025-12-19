package com.espol.main;

import java.util.Date;

public class Reserva {
    private String id;
    private Unidad unidad;
    private Huesped huesped;
    private Date fechaInicio;
    private Date fechaFin;
    private double precioTotal;
    private String estado;
    
    public Reserva(Unidad unidad, Huesped huesped, Date fechaInicio, Date fechaFin, double precioTotal) {
        this.id = "RES-" + System.currentTimeMillis();
        this.unidad = unidad;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.estado = "CONFIRMADA";
    }
    
    public String getId() {
        return id;
    }
    
    public Unidad getUnidad() {
        return unidad;
    }
    
    public Huesped getHuesped() {
        return huesped;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
