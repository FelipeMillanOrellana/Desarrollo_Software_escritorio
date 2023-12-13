package DTO;

public class PericosDTO extends MascotaDTO{
    private int vecesDiceManolo;

    public PericosDTO(int vecesDiceManolo, String nombre, String raza, String dueño) {
        super(nombre, raza, dueño);
        this.vecesDiceManolo = vecesDiceManolo;
    }

    public PericosDTO(int vecesDiceManolo) {
        super();
        this.vecesDiceManolo = vecesDiceManolo;
    }

    public PericosDTO() {
        super();
        this.vecesDiceManolo = -1;
    }

    public int getVecesDiceManolo() {
        return vecesDiceManolo;
    }

    public void setVecesDiceManolo(int vecesDiceManolo) {
        this.vecesDiceManolo = vecesDiceManolo;
    }
   
}
