package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.TipoClima;

public class Elefante extends Animal{
    private double pesoToneladas;

    public Elefante(double pesoToneladas, int numeroRegistro, String nombre, int edad, TipoClima tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.pesoToneladas = pesoToneladas;
    }

    public Elefante(double pesoToneladas) {
        this.pesoToneladas = pesoToneladas;
    }

    public Elefante() {
        super();
        this.pesoToneladas = -1;
    }

    public double getPesoToneladas() {
        return pesoToneladas;
    }

    public void setPesoToneladas(double pesoToneladas) {
        this.pesoToneladas = pesoToneladas;
    }

    @Override
    public String toString() {
        return "Elefante{" + "pesoToneladas=" + pesoToneladas + '}';
    }
    
}
