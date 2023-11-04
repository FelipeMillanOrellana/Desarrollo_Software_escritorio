package cl.duoc.rentcar.DTO;

public class VehiculoPasajerosDTO extends VehiculoDTO {
    
    private int cantidadPasajeros;

    public VehiculoPasajerosDTO(int cantidadPasajeros, String patente, double precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public VehiculoPasajerosDTO(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public VehiculoPasajerosDTO() {
        super();
        this.cantidadPasajeros = -1;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void mostrarDatos() {
    System.out.println("Tipo: Vehículo de Pasajeros");
    System.out.println("Patente: " + getPatente());
    System.out.println("Precio Diario: $" + getPrecioDiario());
    System.out.println("Cantidad de Días de Arriendo: " + getCantidadDias() + " días");
    System.out.println("Cantidad de Pasajeros: " + cantidadPasajeros);
    }

}