package cl.duoc.rentcar.DTO;


public class VehiculoCargaDTO extends VehiculoDTO {
    private double capacidadCarga;

    public VehiculoCargaDTO(double capacidadCarga, String patente, double precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.capacidadCarga = capacidadCarga;
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
    public void mostrarDatos() {
    System.out.println("Tipo: Vehículo de Carga");
    System.out.println("Patente: " + getPatente());
    System.out.println("Precio Diario: $" + getPrecioDiario());
    System.out.println("Cantidad de Días de Arriendo: " + getCantidadDias() + " días");
    System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    
    }


}
