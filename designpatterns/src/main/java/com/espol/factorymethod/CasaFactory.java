package com.espol.factorymethod;

public class CasaFactory extends UnidadFactory {
    @Override
    public IUnidad crearUnidad() {
        return new Casa();
    }
}
