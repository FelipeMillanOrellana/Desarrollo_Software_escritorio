package cl.duoc.dinodino.DTO;

public class VelocirraptorDTO extends Dinosaurio{
    private int velocidadCorriendo;

    public VelocirraptorDTO(int velocidadCorriendo, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.velocidadCorriendo = velocidadCorriendo;
    }

    public VelocirraptorDTO(int velocidadCorriendo) {
        this.velocidadCorriendo = velocidadCorriendo;
    }

    public VelocirraptorDTO() {
        super();
        this.velocidadCorriendo = -1;
    }

    public int getVelocidadCorriendo() {
        return velocidadCorriendo;
    }

    public void setVelocidadCorriendo(int velocidadCorriendo) {
        this.velocidadCorriendo = velocidadCorriendo;
    }

    @Override
    public String toString() {
        return "Velocirraptor{" + "id=" + this.getId() + ", nombre=" + this.getNombre() + ", periodo=" + this.getPeriodo() + ", cantPatas=" + this.getCantPatas() +", Velocidad Corriendo="+ velocidadCorriendo+ '}';
    }
    
}
