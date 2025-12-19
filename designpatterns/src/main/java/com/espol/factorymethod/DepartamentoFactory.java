package com.espol.factorymethod;

public class DepartamentoFactory extends UnidadFactory {
    @Override
    public IUnidad crearUnidad() {
        return new Departamento();
    }
}