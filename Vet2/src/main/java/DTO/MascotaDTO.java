package DTO;


public class MascotaDTO {
    private String nombre;
    private String raza;


    public MascotaDTO(String nombre, String raza, String dueño) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public MascotaDTO() {
        this.nombre = "";
        this.raza = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "MascotaDTO{" + "nombre=" + nombre + ", raza=" + raza +'}';
    }
  
}