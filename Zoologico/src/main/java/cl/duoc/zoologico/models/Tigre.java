package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.TipoClima;

public class Tigre extends Animal{
    private String origen;
    private String idFelino;

    public Tigre(String idFelino, int numeroRegistro, String nombre, int edad, TipoClima tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.idFelino = idFelino;
    }

    public Tigre(String idFelino) {
        this.idFelino = idFelino;
    }

    public Tigre() {
        super();
        this.idFelino = "";
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdFelino() {
        return idFelino;
    }

    public void setIdFelino(String idFelino) {
        this.idFelino = idFelino;
    }

    @Override
    public String toString() {
        return "Tigre{" + "origen=" + origen + ", idFelino=" + idFelino + '}';
    }
    
    
}
