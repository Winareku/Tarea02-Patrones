package com.espol;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.CasaFactory;
import com.espol.factorymethod.DepartamentoFactory;
import com.espol.factorymethod.HabitacionFactory;
import com.espol.factorymethod.IUnidad;
import com.espol.factorymethod.UnidadFactory;

class UnidadFactoryTest {
    
    @Test
    @DisplayName("Todas las factories crean unidades válidas")
    void testTodasLasFactoriesCreanUnidades() {
        UnidadFactory[] factories = {
            new HabitacionFactory(),
            new DepartamentoFactory(),
            new CasaFactory()
        };
        
        for (UnidadFactory factory : factories) {
            IUnidad unidad = factory.crearUnidad();
            assertNotNull(unidad);
            assertNotNull(unidad.getTipo());
            assertTrue(unidad.getPrecioBase() > 0);
            assertTrue(unidad.getCapacidad() > 0);
        }
    }
    
    @Test
    @DisplayName("Factory crea Habitación con tipo correcto")
    void testTipoHabitacion() {
        UnidadFactory factory = new HabitacionFactory();
        IUnidad unidad = factory.crearUnidad();
        assertEquals("Habitación Privada", unidad.getTipo());
    }
    
    @Test
    @DisplayName("Factory crea Departamento con tipo correcto")
    void testTipoDepartamento() {
        UnidadFactory factory = new DepartamentoFactory();
        IUnidad unidad = factory.crearUnidad();
        assertEquals("Departamento", unidad.getTipo());
    }
    
    @Test
    @DisplayName("Factory crea Casa con tipo correcto")
    void testTipoCasa() {
        UnidadFactory factory = new CasaFactory();
        IUnidad unidad = factory.crearUnidad();
        assertEquals("Casa", unidad.getTipo());
    }
    
    @Test
    @DisplayName("Jerarquía de precios")
    void testPreciosEnOrden() {
        IUnidad habitacion = new HabitacionFactory().crearUnidad();
        IUnidad departamento = new DepartamentoFactory().crearUnidad();
        IUnidad casa = new CasaFactory().crearUnidad();
        
        assertTrue(habitacion.getPrecioBase() < departamento.getPrecioBase());
        assertTrue(departamento.getPrecioBase() < casa.getPrecioBase());
    }
    
    @Test
    @DisplayName("Jerarquía de capacidades")
    void testCapacidadesEnOrden() {
        IUnidad habitacion = new HabitacionFactory().crearUnidad();
        IUnidad departamento = new DepartamentoFactory().crearUnidad();
        IUnidad casa = new CasaFactory().crearUnidad();
        
        assertTrue(habitacion.getCapacidad() < departamento.getCapacidad());
        assertTrue(departamento.getCapacidad() < casa.getCapacidad());
    }
    
    @Test
    @DisplayName("Descripciones válidas para todas las unidades")
    void testDescripcionesValidas() {
        UnidadFactory[] factories = {
            new HabitacionFactory(),
            new DepartamentoFactory(),
            new CasaFactory()
        };
        
        for (UnidadFactory factory : factories) {
            IUnidad unidad = factory.crearUnidad();
            String descripcion = unidad.getDescripcion();
            assertNotNull(descripcion);
            assertFalse(descripcion.isEmpty());
        }
    }
}