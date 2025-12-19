package com.espol.factorymethod;

public class Departamento implements IUnidad {
    private double precioBase;
    private int capacidad;
    private int numHabitaciones;
    
    public Departamento() {
        this.precioBase = 120.0;
        this.capacidad = 4;
        this.numHabitaciones = 2;
    }
    
    @Override
    public String getTipo() {
        return "Departamento";
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
        return "Departamento con " + numHabitaciones + " habitaciones, capacidad " + capacidad + " personas";
    }
}