package cl.duoc.dinodino.DTO;

public class TiranosaurioDTO extends Dinosaurio {
    private int cantidadColmillos;

    public TiranosaurioDTO(int cantidadColmillos, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantidadColmillos = cantidadColmillos;
    }

    public TiranosaurioDTO(int cantidadColmillos) {
        this.cantidadColmillos = cantidadColmillos;
    }

    public TiranosaurioDTO() {
        super();
        this.cantidadColmillos = -1;
    }

    public int getCantidadColmillos() {
        return cantidadColmillos;
    }

    public void setCantidadColmillos(int cantidadColmillos) {
        this.cantidadColmillos = cantidadColmillos;
    }

    @Override
    public String toString() {
        return "Tiranosaurio{" + "id=" + this.getId() + ", nombre=" + this.getNombre() + ", periodo=" + this.getPeriodo() + ", cantPatas=" + this.getCantPatas() +", Cantidad de Colmillos="+ cantidadColmillos+ '}';
    }
    
}
