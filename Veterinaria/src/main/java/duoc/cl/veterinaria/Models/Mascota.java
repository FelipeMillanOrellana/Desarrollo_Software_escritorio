package duoc.cl.veterinaria.Models;

public class Mascota {
    private String Nombre;
    private String FechaNacimiento;
    private String Nchip;
    private String NombreDueño;

     public Mascota() {
        this.Nombre = "Sin nombre";
        this.FechaNacimiento = "no nacio";
        this.Nchip = "No tine chip";
        this.NombreDueño = "Sin Dueño";
        
    }    
    public Mascota(String Nombre, String FechaNacimiento, String Nchip, String NombreDueño) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Nchip = Nchip;
        this.NombreDueño = NombreDueño;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNchip() {
        return Nchip;
    }

    public void setNchip(String Nchip) {
        this.Nchip = Nchip;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }
    
}
