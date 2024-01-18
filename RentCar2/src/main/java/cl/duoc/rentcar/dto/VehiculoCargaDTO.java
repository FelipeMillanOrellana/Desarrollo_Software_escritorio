package cl.duoc.rentcar.dto;

public class VehiculoCargaDTO extends VehiculoDTO{

    private double capacidadCarga;

    public VehiculoCargaDTO(double capacidadCarga, String patente, int precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.capacidadCarga = (int) capacidadCarga;
    }
    public VehiculoCargaDTO(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public VehiculoCargaDTO() {
        super();
        this.capacidadCarga = -1;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "VehiculoCargaDTO{" + "capacidadCarga=" + capacidadCarga + '}';
    }
    
    

 
}
