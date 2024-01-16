package cl.duoc.dinodino.DTO;

public class EstegosaurioDTO extends Dinosaurio{
    private int cantidadEspinas;

    public EstegosaurioDTO(int cantidadEspinas, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantidadEspinas = cantidadEspinas;
    }

    public EstegosaurioDTO(int cantidadEspinas) {
        this.cantidadEspinas = cantidadEspinas;
    }

    public EstegosaurioDTO() {
        super();
        this.cantidadEspinas = -1;
    }

    public int getCantidadEspinas() {
        return cantidadEspinas;
    }

    public void setCantidadEspinas(int cantidadEspinas) {
        this.cantidadEspinas = cantidadEspinas;
    }

    @Override
    public String toString() {
        return "Estegosaurio{" + "id=" + this.getId() + ", nombre=" + this.getNombre() + ", periodo=" + this.getPeriodo() + ", cantPatas=" + this.getCantPatas() +", Cantidad de Espinas="+ cantidadEspinas+ '}';
    }
    
}
