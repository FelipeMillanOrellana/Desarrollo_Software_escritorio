package cl.duoc.zoologico.models;

import java.time.LocalDate;
import java.util.ArrayList;  
import java.util.List;

public class Ambiente {
    private List<Animal> animales;
    private String sector;
    private String nombreJaula;
    private String descripcion;
    private String fechaMantenimiento;
    private String ecosistema;

    // Constructor
    public Ambiente(String sector, String nombreJaula, String descripcion, String fechaMantenimiento, String ecosistema) {
        this.animales = new ArrayList<>();
        this.sector = sector;
        this.nombreJaula = nombreJaula;
        this.descripcion = descripcion;
        this.fechaMantenimiento = fechaMantenimiento;
        this.ecosistema = ecosistema;
    }

    public Ambiente() {
        this.animales = new ArrayList<>();
        this.sector = sector;
        this.nombreJaula = nombreJaula;
        this.descripcion = descripcion;
        this.fechaMantenimiento = fechaMantenimiento;
        this.ecosistema = ecosistema;
    }
    
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void eliminarAnimal(Animal animal) {
        animales.remove(animal);
    }

    public List<Animal> obtenerAnimales() {
        return animales;
    }

    public void realizarMantenimiento(String nuevaFecha) {
        this.fechaMantenimiento = nuevaFecha;
    }

    public String obtenerInformacion() {
        return "Sector: " + sector + "\nNombre de la Jaula: " + nombreJaula + "\nDescripción: " + descripcion +
                "\nFecha de Mantenimiento: " + fechaMantenimiento + "\nEcosistema: " + ecosistema;
    }
}
