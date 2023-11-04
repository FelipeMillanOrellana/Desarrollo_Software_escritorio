package cl.duoc.rentcar.DTO;

import cl.duoc.rentcar.services.Interfaz;

public abstract class VehiculoDTO implements Interfaz{
    private String patente;
    private double precioDiario;
    private int cantidadDias;

    public VehiculoDTO(String patente, double precioDiario, int cantidadDias) {
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

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
    
    public abstract void mostrarDatos();

    public void mostrarDetalleBoleta() {
        double precioArriendo = precioDiario * cantidadDias; // Precio sin IVA
        double iva = precioArriendo * Iva;
        double total = precioArriendo + iva;

        System.out.println("Tipo: Vehículo");
        System.out.println("Patente: " + patente);
        System.out.println("Precio Diario: $" + precioDiario);
        System.out.println("Cantidad de Días de Arriendo: " + cantidadDias + " días");
        System.out.println("Precio de Arriendo: $" + precioArriendo);
        System.out.println("IVA (" + (Iva * 100) + "%): $" + iva);
        System.out.println("Total a Pagar: $" + total);
    }
}
