package cl.duoc.rentcar.dto;

public class VehiculoPasajerosDTO extends VehiculoDTO {
    
    private int cantidadPasajeros;

    public VehiculoPasajerosDTO(int cantidadPasajeros, String patente, int precioDiario, int cantidadDias) {
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
    public String toString() {
        return "VehiculoPasajerosDTO{" + "cantidadPasajeros=" + cantidadPasajeros + '}';
    }
    

}
