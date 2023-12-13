package DTO;

public class CacatuasDTO extends MascotaDTO{
    
    private int vecesSalta;
    private boolean muevePlumasCabeza;

    public CacatuasDTO(String nombre, String raza, String dueño, int vecesSalta, boolean muevePlumasCabeza) {
        super(nombre, raza, dueño);
        this.vecesSalta = vecesSalta;
        this.muevePlumasCabeza = muevePlumasCabeza;
    }

    public CacatuasDTO() {
        super();
        this.vecesSalta = -1;
        this.muevePlumasCabeza = false;
    }

    public int getVecesSalta() {
        return vecesSalta;
    }

    public void setVecesSalta(int vecesSalta) {
        this.vecesSalta = vecesSalta;
    }

    public boolean isMuevePlumasCabeza() {
        return muevePlumasCabeza;
    }

    public void setMuevePlumasCabeza(boolean muevePlumasCabeza) {
        this.muevePlumasCabeza = muevePlumasCabeza;
    }
}
