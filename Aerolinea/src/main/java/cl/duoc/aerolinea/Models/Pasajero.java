package cl.duoc.aerolinea.Models;

import java.time.LocalDate;
import cl.duoc.aerolinea.utils.Validacion;

public class Pasajero {
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int run;
    private char dv;
    private long telefono;
    private String email;
    private boolean vetado;

    public Pasajero(int id, String nombre, LocalDate fechaNacimiento, int run, char dv, long telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.dv = dv;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
    }

    public Pasajero() {
        this.id = -1;
        this.nombre = "Sin nombre";
        this.fechaNacimiento = LocalDate.now();
        this.run = 0;
        this.dv = '0';
        this.telefono = 0L;
        this.email = "";
        this.vetado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if(Validacion.ValidaTelefono(telefono)){
            this.telefono = telefono;        
        }
        else{
             System.out.println("Error al ingresar el Telefono");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", dv=" + dv + ", telefono=" + telefono + ", email=" + email + ", vetado=" + vetado + '}';
    }

}
