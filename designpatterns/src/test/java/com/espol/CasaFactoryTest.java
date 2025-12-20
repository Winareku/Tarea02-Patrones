package com.espol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import com.espol.factorymethod.Casa;
import com.espol.factorymethod.CasaFactory;
import com.espol.factorymethod.IUnidad;
import com.espol.factorymethod.UnidadFactory;

class CasaFactoryTest {
    
    private CasaFactory factory;
    
    @BeforeEach
    void setUp() {
        factory = new CasaFactory();
    }
    
    @Test
    @DisplayName("Crear unidad no nula")
    void testCrearUnidadNoNula() {
        IUnidad unidad = factory.crearUnidad();
        assertNotNull(unidad);
    }
    
    @Test
    @DisplayName("Crear instancia de Casa")
    void testCrearCasa() {
        IUnidad unidad = factory.crearUnidad();
        assertTrue(unidad instanceof Casa);
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
        assertEquals("Casa", unidad.getTipo());
        assertEquals(200.0, unidad.getPrecioBase(), 0.01);
        assertEquals(6, unidad.getCapacidad());
    }
    
    @Test
    @DisplayName("Crear múltiples instancias distintas")
    void testMultiplesInstancias() {
        IUnidad unidad1 = factory.crearUnidad();
        IUnidad unidad2 = factory.crearUnidad();
        assertNotSame(unidad1, unidad2);
    }
}