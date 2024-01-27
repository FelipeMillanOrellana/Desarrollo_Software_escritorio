package cl.duoc.zoologico.models;

import cl.duoc.zoologico.utils.ValidacionVisitante;
import java.time.LocalDate;

public class Visitante {
    private int rut;
    private char dv;
    private String nombreCompleto;
    private String correoElectronico;
    private long telefono;
    private String direccion;
    private LocalDate edad;
    private String estadoCivil;

    public Visitante(int rut, char dv, String nombreCompleto, String correoElectronico, long telefono, String direccion, LocalDate edad, String estadoCivil) {
        this.rut = rut;
        this.dv = dv;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public Visitante() {
        this.rut = -1;
        this.dv = '0';
        this.nombreCompleto = "";
        this.correoElectronico = "";
        this.telefono = -1;
        this.direccion = "";
        this.edad = LocalDate.now();
        this.estadoCivil = "";
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char dv){
        if(ValidacionVisitante.ValidaRut(rut, dv))
        {
            this.rut = rut;
            this.dv = dv;
        }
        else{
            System.out.println("No se almaceno rut.");
        }
    }

    public char getDv() {
        return dv;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setedad(LocalDate edad) {
        if(ValidacionVisitante.ValidaEdad(edad))
            this.edad = edad;
        else
            System.out.println("No se almaceno fecha.");
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    @Override
    public String toString() {
        return "Visitante{" + "rut=" + rut + ", dv=" + dv + ", nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
    
}
