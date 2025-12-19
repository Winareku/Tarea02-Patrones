package com.espol.facade;

import com.espol.main.enums.*;
import com.espol.main.*;
import com.espol.singleton.NotificationManager;
import java.util.Date;

public class ReservaFacade {
    private DisponibilidadService disponibilidadService;
    private PreciosService preciosService;
    private PagoService pagoService;
    private PoliticasService politicasService;
    
    public ReservaFacade() {
        this.disponibilidadService = new DisponibilidadService();
        this.preciosService = new PreciosService();
        this.pagoService = new PagoService();
        this.politicasService = new PoliticasService();
    }
    
    public Reserva realizarReserva(Unidad unidad, Huesped huesped, Date fechaInicio, Date fechaFin) {
        if (!politicasService.verificarPoliticas(unidad, huesped)) {
            System.out.println("El huésped no cumple con las políticas");
            return null;
        }
        
        if (!disponibilidadService.verificarDisponibilidad(unidad, fechaInicio, fechaFin)) {
            System.out.println("La unidad no está disponible");
            return null;
        }
        
        double precioTotal = preciosService.calcularPrecioTotal(unidad, fechaInicio, fechaFin);
        
        if (!pagoService.procesarPago(precioTotal, "tarjeta")) {
            System.out.println("Error al procesar el pago");
            return null;
        }
        
        disponibilidadService.bloquearUnidad(unidad, fechaInicio, fechaFin);
        
        Reserva reserva = new Reserva(unidad, huesped, fechaInicio, fechaFin, precioTotal);
        huesped.realizarReserva(reserva);
        
        NotificationManager.getInstance().sendNotification(
            "Reserva confirmada para " + unidad.getId(),
            huesped.getEmail()
        );
        
        return reserva;
    }
    
    public boolean cancelarReserva(Reserva reserva) {
        Date ahora = new Date();
        double penalizacion = politicasService.calcularPenalizacion(reserva, ahora);
        double reembolso = reserva.getPrecioTotal() - penalizacion;
        
        if (pagoService.procesarReembolso(reembolso)) {
            reserva.setEstado("CANCELADA");
            reserva.getUnidad().setEstado(EstadoUnidad.DISPONIBLE);
            return true;
        }
        return false;
    }
    
    public boolean modificarReserva(Reserva reserva, Date nuevaFecha) {
        if (disponibilidadService.verificarDisponibilidad(reserva.getUnidad(), nuevaFecha, reserva.getFechaFin())) {
            reserva.setFechaInicio(nuevaFecha);
            return true;
        }
        return false;
    }
}