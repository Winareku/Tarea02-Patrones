package com.espol.factorymethod;

public class HabitacionFactory extends UnidadFactory {
    @Override
    public IUnidad crearUnidad() {
        return new HabitacionPrivada();
    }
}
