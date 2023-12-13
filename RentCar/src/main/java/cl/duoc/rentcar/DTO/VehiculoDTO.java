package cl.duoc.rentcar.DTO;

import cl.duoc.rentcar.services.Interfaz;

public abstract class VehiculoDTO implements Interfaz{
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

    public double getPrecioDiario() {
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
    
    public abstract void mostrarDatos();

    @Override
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
