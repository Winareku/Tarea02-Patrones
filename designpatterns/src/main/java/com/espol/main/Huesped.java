package com.espol.main;

import java.util.ArrayList;
import java.util.List;

public class Huesped extends Usuario {
    private List<Reserva> reservas;
    private double calificacion;
    
    public Huesped(String id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
        this.reservas = new ArrayList<>();
        this.calificacion = 5.0;
    }
    
    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    
    public List<Reserva> getReservas() {
        return reservas;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
