package cl.duoc.rentcar.dto;

import static cl.duoc.rentcar.Services.Interfaz.Iva;

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
        this.patente = patente;
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
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

    @Override
    public String toString() {
        return "VehiculoDTO{" + "patente=" + patente + ", precioDiario=" + precioDiario + ", cantidadDias=" + cantidadDias + '}';
    }

    public void mostrarDatos() {
        
    }

   public void mostrarDetalleBoleta() {
        int precioArriendo = precioDiario * cantidadDias; // Precio sin IVA
        int iva = (int) (precioArriendo * Iva);
        int total = (int) (precioArriendo + iva);

        System.out.println("Tipo: Vehículo");
        System.out.println("Patente: " + patente);
        System.out.println("Precio Diario: $" + precioDiario);
        System.out.println("Días de Arriendo: " + cantidadDias + " días");
        System.out.println("Precio de Arriendo: $" + precioArriendo);
        System.out.println("IVA (" + (Iva * 100) + "%): $" + iva);
        System.out.println("Total a Pagar: $" + total);
    }
    
    
}
