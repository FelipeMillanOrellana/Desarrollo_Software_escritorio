package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.TipoClima;
import java.util.Date;

public class Orangutan extends Animal{
    private Date fechaEntrada;

    public Orangutan(Date fechaEntrada, int numeroRegistro, String nombre, int edad, TipoClima tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.fechaEntrada = fechaEntrada;
    }

    public Orangutan(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Orangutan() {
        super();
        this.fechaEntrada = new Date();
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        return "Orangutan{" + "fechaEntrada=" + fechaEntrada + '}';
    }
    
}
