package DTO;

public class DueñoDTO {
    private String Nombre;
    private int Run;

    public DueñoDTO(String Nombre, int Run) {
        this.Nombre = Nombre;
        this.Run = Run;
    }

    public DueñoDTO() {
        this.Nombre = "";
        this.Run = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int Run) {
        this.Run = Run;
    }
  
@Override
    public String toString() {
        return "Dueño{" + "Nombre: " + Nombre + ", Run: " + Run +'}';
    }
}
