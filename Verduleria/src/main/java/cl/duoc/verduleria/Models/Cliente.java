package cl.duoc.verduleria.Models;

public class Cliente {
    private int run;
    private char dv;
    private String nombre;
    private String mail;
    private String direccion;
    private long telefono;

    public Cliente(int run, char dv, String nombre,String mail, String direccion, long telefono) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
        this.run = 0;
        this.dv = '0';
        this.nombre = "";
        this.mail = "";
        this.direccion = "";
        this.telefono = 0L;
    }

    public int getRun() {
        return this.run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return this.dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.run+"-"+this.dv;
    }
    
    
}
