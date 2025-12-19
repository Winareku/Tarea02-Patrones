package com.espol.facade;

import com.espol.main.*;
import com.espol.main.enums.*;
import java.util.Date;

public class DisponibilidadService {
    public boolean verificarDisponibilidad(Unidad unidad, Date fechaInicio, Date fechaFin) {
        return unidad.getEstado() == EstadoUnidad.DISPONIBLE;
    }
    
    public void bloquearUnidad(Unidad unidad, Date fechaInicio, Date fechaFin) {
        unidad.setEstado(EstadoUnidad.RESERVADA);
    }
}
