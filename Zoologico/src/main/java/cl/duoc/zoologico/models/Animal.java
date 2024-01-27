package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.TipoClima;

public class Animal {
    private int numeroRegistro;
    private String nombre;
    private int edad;
    private TipoClima tipoClima;
    private String descripcion;

    public Animal(int numeroRegistro, String nombre, int edad, TipoClima tipoClima, String descripcion) {
        this.numeroRegistro = numeroRegistro;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoClima = tipoClima;
        this.descripcion = descripcion;
    }

    public Animal() {
        this.numeroRegistro = -1;
        this.nombre = "";
        this.edad = -1;
        this.tipoClima = tipoClima;
        this.descripcion = "";
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoClima getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(TipoClima tipoClima) {
        this.tipoClima = tipoClima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroRegistro=" + numeroRegistro + ", nombre=" + nombre + ", edad=" + edad + ", tipoClima=" + tipoClima + ", descripcion=" + descripcion + '}';
    }
    
}
