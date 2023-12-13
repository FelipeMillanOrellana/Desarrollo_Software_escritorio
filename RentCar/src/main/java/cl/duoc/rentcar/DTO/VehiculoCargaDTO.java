package cl.duoc.rentcar.DTO;

public class VehiculoCargaDTO extends VehiculoDTO {
    private int capacidadCarga;

    public VehiculoCargaDTO(double capacidadCarga, String patente, int precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.capacidadCarga = (int) capacidadCarga;
    }
    public VehiculoCargaDTO(double capacidadCarga) {
        this.capacidadCarga = (int) capacidadCarga;
    }
    public VehiculoCargaDTO() {
        super();
        this.capacidadCarga = -1;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = (int) capacidadCarga;
    }
    
    @Override
    public void mostrarDatos() {
    System.out.println("Tipo: Vehículo de Carga");
    System.out.println("Patente: " + getPatente());
    System.out.println("Precio diario: $" + getPrecioDiario());
    System.out.println("Cantidad de días de arriendo del vehiculo: " + getCantidadDias() + " días");
    System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    
    }
}
