package DTO;

public class GatosDTO extends MascotaDTO{
    private int tamanoGarras;
    private int maullidosNocturnos;

    public GatosDTO(String nombre, String raza,String dueño, int tamanoGarras, int maullidosNocturnos) {
        super(nombre, raza, dueño);
        this.tamanoGarras = tamanoGarras;
        this.maullidosNocturnos = maullidosNocturnos;
    }

    public GatosDTO(String nombre, String raza) {
        super();
        this.tamanoGarras = -1;
        this.maullidosNocturnos = -1;
    }

    public int getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(int tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getMaullidosNocturnos() {
        return maullidosNocturnos;
    }

    public void setMaullidosNocturnos(int maullidosNocturnos) {
        this.maullidosNocturnos = maullidosNocturnos;
    }
}