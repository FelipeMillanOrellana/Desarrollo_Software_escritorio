package cl.duoc.rentcar.dto;

import static cl.duoc.rentcar.Services.IVehiculoService.Iva;

public abstract class VehiculoDTO {
    private String patente;
    private int precioDiario;
    private int cantidadDias;

    public VehiculoDTO(String patente, int precioDiario, int cantidadDias) {
        this.patente = patente;
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
    }

    public VehiculoDTO() {
        this.patente = "";
        this.precioDiario = -1;
        this.cantidadDias = -1;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(int precioDiario) {
        this.precioDiario = precioDiario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public void mostrarDetalleBoleta() {
        int precioArriendo = precioDiario * cantidadDias; // Precio sin IVA
        int iva = (int) (precioArriendo * Iva);
        int total = (int) (precioArriendo + iva);

        System.out.println("Precio Diario: $" + precioDiario);
        System.out.println("Días de Arriendo: " + cantidadDias + " días");
        System.out.println("Precio de Arriendo: $" + precioArriendo);
        System.out.println("IVA (" + (Iva * 100) + "%): $" + iva);
        System.out.println("Total a Pagar: $" + total);
    }

    public void mostrarDatos() {
        System.out.println("Tipo: Vehículo");
        System.out.println("Patente: " + patente);
    }

    @Override
    public String toString() {
        String mensaje = "VehiculoDTO{" + "patente=" + patente + ", precioDiario=" + precioDiario + ", cantidadDias=" + cantidadDias + '}';
        return mensaje;
    }
    
}
