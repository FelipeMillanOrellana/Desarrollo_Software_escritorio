package DTO;

public class PerrosDTO extends MascotaDTO {
    private int ladridosAlDia;
    private boolean babea;

    public PerrosDTO(int ladridosAlDia, boolean babea, String nombre, String raza, String dueño) {
        super(nombre, raza,dueño);
        this.ladridosAlDia = ladridosAlDia;
        this.babea = babea;
    }

    public PerrosDTO(String nombre, String raza) {
        super();
        this.ladridosAlDia = -1;
        this.babea = false;
    }

    
    public int getLadridosAlDia() {
        return ladridosAlDia;
        }

    public void setLadridosAlDia(int ladridosAlDia) {
        this.ladridosAlDia = ladridosAlDia;
        }

    public boolean isBabea() {
        return babea;
        }

    public void setBabea(boolean babea) {
        this.babea = babea;
        }
}
