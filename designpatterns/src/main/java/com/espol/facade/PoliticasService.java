package com.espol.facade;

import com.espol.main.Huesped;
import com.espol.main.Reserva;
import com.espol.main.Unidad;
import java.util.Date;

public class PoliticasService {
    public boolean verificarPoliticas(Unidad unidad, Huesped huesped) {
        return huesped.getCalificacion() >= 3.0;
    }
    
    public double calcularPenalizacion(Reserva reserva, Date fechaCancelacion) {
        long diasAntes = (reserva.getFechaInicio().getTime() - fechaCancelacion.getTime()) / (1000 * 60 * 60 * 24);
        if (diasAntes < 7) {
            return reserva.getPrecioTotal() * 0.5;
        } else if (diasAntes < 30) {
            return reserva.getPrecioTotal() * 0.25;
        }
        return 0.0;
    }
}