package com.espol.factorymethod;

public class HabitacionPrivada implements IUnidad {
    private double precioBase;
    private int capacidad;
    
    public HabitacionPrivada() {
        this.precioBase = 50.0;
        this.capacidad = 2;
    }
    
    @Override
    public String getTipo() {
        return "Habitación Privada";
    }
    
    @Override
    public double getPrecioBase() {
        return precioBase;
    }
    
    @Override
    public int getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String getDescripcion() {
        return "Habitación privada con capacidad para " + capacidad + " personas";
    }
}