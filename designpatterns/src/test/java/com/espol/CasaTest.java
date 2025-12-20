package com.espol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.Casa;
import com.espol.factorymethod.Departamento;
import com.espol.factorymethod.HabitacionPrivada;
import com.espol.factorymethod.IUnidad;

class CasaTest {
    
    private Casa casa;
    
    @BeforeEach
    void setUp() {
        casa = new Casa();
    }
    
    @Test
    @DisplayName("Crear Casa no nula")
    void testCreacionCasa() {
        assertNotNull(casa);
    }
    
    @Test
    @DisplayName("Obtener tipo correcto")
    void testGetTipo() {
        assertEquals("Casa", casa.getTipo());
    }
    
    @Test
    @DisplayName("Verificar precio base")
    void testGetPrecioBase() {
        assertEquals(200.0, casa.getPrecioBase(), 0.01);
        assertTrue(casa.getPrecioBase() > 0);
    }
    
    @Test
    @DisplayName("Verificar capacidad")
    void testGetCapacidad() {
        assertEquals(6, casa.getCapacidad());
        assertTrue(casa.getCapacidad() > 0);
    }
    
    @Test
    @DisplayName("Verificar descripción")
    void testGetDescripcion() {
        String descripcion = casa.getDescripcion();
        assertNotNull(descripcion);
        assertTrue(descripcion.contains("Casa"));
    }
    
    @Test
    @DisplayName("Implementa interfaz IUnidad")
    void testImplementaInterfaz() {
        assertTrue(casa instanceof IUnidad);
    }
    
    @Test
    @DisplayName("Precio más alto que otras unidades")
    void testPrecioMasAlto() {
        HabitacionPrivada habitacion = new HabitacionPrivada();
        Departamento departamento = new Departamento();
        assertTrue(casa.getPrecioBase() > habitacion.getPrecioBase());
        assertTrue(casa.getPrecioBase() > departamento.getPrecioBase());
    }
    
    @Test
    @DisplayName("Mayor capacidad que otras unidades")
    void testMayorCapacidad() {
        HabitacionPrivada habitacion = new HabitacionPrivada();
        Departamento departamento = new Departamento();
        assertTrue(casa.getCapacidad() > habitacion.getCapacidad());
        assertTrue(casa.getCapacidad() > departamento.getCapacidad());
    }
}