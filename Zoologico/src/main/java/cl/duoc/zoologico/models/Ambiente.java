package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.Sectores;
import cl.duoc.zoologico.utils.Ecosistema;
import java.util.ArrayList;  
import java.util.Date;

public class Ambiente {
    private ArrayList<Animal> animal;
    private Sectores sector;
    private String nombreJaula;
    private String descripcion;
    private Date fechaMantenimiento;
    private Ecosistema ecosistema;

    public Ambiente(ArrayList<Animal> animal, Sectores sector, String nombreJaula, String descripcion, Date fechaMantenimiento, Ecosistema ecosistema) {
        this.animal = animal;
        this.sector = sector;
        this.nombreJaula = nombreJaula;
        this.descripcion = descripcion;
        this.fechaMantenimiento = fechaMantenimiento;
        this.ecosistema = ecosistema;
    }

    
    public Ambiente() {
        this.animal = new ArrayList<Animal>();
        this.sector = Sectores.Otro;
        this.nombreJaula = "";
        this.descripcion = "";
        this.fechaMantenimiento = new Date();
        this.ecosistema = Ecosistema.Otro;
    }

    public ArrayList<Animal> getAnimales() {
        return animal;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animal = animales;
    }

    public Sectores getSector() {
        return sector;
    }

    public void setSector(Sectores sector) {
        this.sector = sector;
    }

    public String getNombreJaula() {
        return nombreJaula;
    }

    public void setNombreJaula(String nombreJaula) {
        this.nombreJaula = nombreJaula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public Ecosistema getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(Ecosistema ecosistema) {
        this.ecosistema = ecosistema;
    }

    public String obtenerInformacion() {
        return "Sector: " + sector + "\nNombre de la Jaula: " + nombreJaula + "\nDescripción: " + descripcion +
                "\nFecha de Mantenimiento: " + fechaMantenimiento + "\nEcosistema: " + ecosistema;
    }
    
    /*Sectores Checkbox*/
    
}
