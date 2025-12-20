package com.espol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.HabitacionFactory;
import com.espol.factorymethod.HabitacionPrivada;
import com.espol.factorymethod.IUnidad;
import com.espol.factorymethod.UnidadFactory;

class HabitacionFactoryTest {
    
    private HabitacionFactory factory;
    
    @BeforeEach
    void setUp() {
        factory = new HabitacionFactory();
    }
    
    @Test
    @DisplayName("Crear unidad no nula")
    void testCrearUnidadNoNula() {
        IUnidad unidad = factory.crearUnidad();
        assertNotNull(unidad);
    }
    
    @Test
    @DisplayName("Crear instancia de HabitacionPrivada")
    void testCrearHabitacionPrivada() {
        IUnidad unidad = factory.crearUnidad();
        assertTrue(unidad instanceof HabitacionPrivada);
    }
    
    @Test
    @DisplayName("Hereda de UnidadFactory")
    void testHeredaDeUnidadFactory() {
        assertTrue(factory instanceof UnidadFactory);
    }
    
    @Test
    @DisplayName("Verificar propiedades de unidad creada")
    void testPropiedadesUnidadCreada() {
        IUnidad unidad = factory.crearUnidad();
        assertEquals("Habitación Privada", unidad.getTipo());
        assertEquals(50.0, unidad.getPrecioBase(), 0.01);
        assertEquals(2, unidad.getCapacidad());
    }
    
    @Test
    @DisplayName("Crear múltiples instancias distintas")
    void testMultiplesInstancias() {
        IUnidad unidad1 = factory.crearUnidad();
        IUnidad unidad2 = factory.crearUnidad();
        assertNotSame(unidad1, unidad2);
    }
}