package com.espol.facade;

import com.espol.main.Unidad;
import java.util.Date;

public class PreciosService {
    public double calcularPrecioTotal(Unidad unidad, Date fechaInicio, Date fechaFin) {
        long dias = (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
        return unidad.getUnidadTipo().getPrecioBase() * dias;
    }
    
    public double calcularDeposito(Unidad unidad) {
        return unidad.getUnidadTipo().getPrecioBase() * 0.2;
    }
    
    public double calcularTarifasAdicionales(Unidad unidad) {
        return unidad.getUnidadTipo().getPrecioBase() * 0.1;
    }
}