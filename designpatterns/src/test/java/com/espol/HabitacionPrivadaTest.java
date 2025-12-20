package com.espol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.HabitacionPrivada;
import com.espol.factorymethod.IUnidad;

class HabitacionPrivadaTest {
    
    private HabitacionPrivada habitacion;
    
    @BeforeEach
    void setUp() {
        habitacion = new HabitacionPrivada();
    }
    
    @Test
    @DisplayName("Crear Habitación Privada no nula")
    void testCreacionHabitacion() {
        assertNotNull(habitacion);
    }
    
    @Test
    @DisplayName("Obtener tipo correcto")
    void testGetTipo() {
        assertEquals("Habitación Privada", habitacion.getTipo());
    }
    
    @Test
    @DisplayName("Verificar precio base")
    void testGetPrecioBase() {
        assertEquals(50.0, habitacion.getPrecioBase(), 0.01);
        assertTrue(habitacion.getPrecioBase() > 0);
    }
    
    @Test
    @DisplayName("Verificar capacidad")
    void testGetCapacidad() {
        assertEquals(2, habitacion.getCapacidad());
        assertTrue(habitacion.getCapacidad() > 0);
    }
    
    @Test
    @DisplayName("Verificar descripción")
    void testGetDescripcion() {
        String descripcion = habitacion.getDescripcion();
        assertNotNull(descripcion);
        assertTrue(descripcion.contains("Habitación privada"));
    }
    
    @Test
    @DisplayName("Implementa interfaz IUnidad")
    void testImplementaInterfaz() {
        assertTrue(habitacion instanceof IUnidad);
    }
}