package cl.duoc.miservicio.models;

public class Persona {
    private int id;
    private String nombre;
    private String Apellido;

    public Persona(int id, String nombre, String Apellido) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public Persona() {
        this.id = -1;
        this.nombre = "Sin nombre";
        this.Apellido = "Sin apellido";
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
    
}
