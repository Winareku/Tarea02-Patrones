package com.espol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.Departamento;
import com.espol.factorymethod.HabitacionPrivada;
import com.espol.factorymethod.IUnidad;

class DepartamentoTest {
    
    private Departamento departamento;
    
    @BeforeEach
    void setUp() {
        departamento = new Departamento();
    }
    
    @Test
    @DisplayName("Crear Departamento no nulo")
    void testCreacionDepartamento() {
        assertNotNull(departamento);
    }
    
    @Test
    @DisplayName("Obtener tipo correcto")
    void testGetTipo() {
        assertEquals("Departamento", departamento.getTipo());
    }
    
    @Test
    @DisplayName("Verificar precio base")
    void testGetPrecioBase() {
        assertEquals(120.0, departamento.getPrecioBase(), 0.01);
        assertTrue(departamento.getPrecioBase() > 0);
    }
    
    @Test
    @DisplayName("Verificar capacidad")
    void testGetCapacidad() {
        assertEquals(4, departamento.getCapacidad());
        assertTrue(departamento.getCapacidad() > 0);
    }
    
    @Test
    @DisplayName("Verificar descripción")
    void testGetDescripcion() {
        String descripcion = departamento.getDescripcion();
        assertNotNull(descripcion);
        assertTrue(descripcion.contains("Departamento"));
    }
    
    @Test
    @DisplayName("Implementa interfaz IUnidad")
    void testImplementaInterfaz() {
        assertTrue(departamento instanceof IUnidad);
    }
    
    @Test
    @DisplayName("Precio mayor que habitación")
    void testPrecioMayorQueHabitacion() {
        HabitacionPrivada habitacion = new HabitacionPrivada();
        assertTrue(departamento.getPrecioBase() > habitacion.getPrecioBase());
    }
}