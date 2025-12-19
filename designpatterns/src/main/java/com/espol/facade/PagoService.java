package com.espol.facade;

public class PagoService {
    public boolean procesarPago(double monto, String metodoPago) {
        System.out.println("Procesando pago de $" + monto + " con " + metodoPago);
        return true;
    }
    
    public boolean procesarReembolso(double monto) {
        System.out.println("Procesando reembolso de $" + monto);
        return true;
    }
    
    public boolean cobrarDeposito(double monto) {
        System.out.println("Cobrando depósito de $" + monto);
        return true;
    }
}