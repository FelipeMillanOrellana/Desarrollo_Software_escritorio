package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.TipoClima;
import java.util.Date;

public class Leon extends Animal{
    private Date ProxFechaDentista;

    public Leon(Date ProxFechaDentista, int numeroRegistro, String nombre, int edad, TipoClima tipoClima, String descripcion) {
        super(numeroRegistro, nombre, edad, tipoClima, descripcion);
        this.ProxFechaDentista = ProxFechaDentista;
    }

    public Leon(Date ProxFechaDentista) {
        this.ProxFechaDentista = ProxFechaDentista;
    }

    public Leon() {
        super();
        this.ProxFechaDentista = new Date();
    }

    public Date getProxFechaDentista() {
        return ProxFechaDentista;
    }

    public void setProxFechaDentista(Date ProxFechaDentista) {
        this.ProxFechaDentista = ProxFechaDentista;
    }

    @Override
    public String toString() {
        return "Leon{" + "ProxFechaDentista=" + ProxFechaDentista + '}';
    }
  
}
