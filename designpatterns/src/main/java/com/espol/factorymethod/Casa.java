package com.espol.factorymethod;

public class Casa implements IUnidad {
    private double precioBase;
    private int capacidad;
    private int numHabitaciones;
    private boolean tieneJardin;
    
    public Casa() {
        this.precioBase = 200.0;
        this.capacidad = 6;
        this.numHabitaciones = 3;
        this.tieneJardin = true;
    }
    
    @Override
    public String getTipo() {
        return "Casa";
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
        String jardin = tieneJardin ? " con jardín" : "";
        return "Casa con " + numHabitaciones + " habitaciones" + jardin + ", capacidad " + capacidad + " personas";
    }
}