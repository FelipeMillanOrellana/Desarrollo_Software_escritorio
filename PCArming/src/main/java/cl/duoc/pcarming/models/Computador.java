package cl.duoc.pcarming.models;

import static cl.duoc.pcarming.services.IComputadoraService.DescuentoDuoc;
import static cl.duoc.pcarming.services.IComputadoraService.DescuentoVerano;
import static cl.duoc.pcarming.services.IComputadoraService.Iva;

public abstract class Computador {
    /*
Cada computador debe poseer un código para identificarlo como único, además de sus datos propios tales como: CPU,
RAM, Cantidad de Almacenamiento, Tipo de Almacenamiento, Tipo de pantalla (si es que incluye), cantidad de puertos
USB, etc. (puede agregar los campos que sean necesarios para demostrar su desarrollo).
• La clase padre debe ser abstracta.
    */
    private String codigo;
    private String cpu;
    private int ram;
    private String almacenamiento;
    private String tipoAlmacenamiento;
    private String tipoPantalla;
    private int cantPuertosUSB;
    private boolean estudianteDuoc;
    private boolean verano;
    private int costo;

    public Computador(String codigo, String cpu, int ram, String almacenamiento, String tipoAlmacenamiento, String tipoPantalla, int cantPuertosUSB, boolean estudianteDuoc, boolean verano, int costo) {
        this.codigo = codigo;
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tipoPantalla = tipoPantalla;
        this.cantPuertosUSB = cantPuertosUSB;
        this.estudianteDuoc = estudianteDuoc;
        this.verano = verano;
        this.costo = costo;;
    }

    public Computador() {
        this.codigo = "Sin codigo";
        this.cpu = "Sin CPU";
        this.ram = -1;
        this.almacenamiento = "Sin almacenamiento";
        this.tipoAlmacenamiento = "Sin almacenamiento";
        this.tipoPantalla = "No incluye Pantalla";
        this.cantPuertosUSB = -1;
        this.estudianteDuoc = false;
        this.verano = false;
        this.costo = -1;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public int getCantPuertosUSB() {
        return cantPuertosUSB;
    }

    public void setCantPuertosUSB(int cantPuertosUSB) {
        this.cantPuertosUSB = cantPuertosUSB;
    }

    public boolean isEstudianteDuoc() {
        return estudianteDuoc;
    }

    public void setEstudianteDuoc(boolean estudianteDuoc) {
        this.estudianteDuoc = estudianteDuoc;
    }

    public boolean isVerano() {
        return verano;
    }

    public void setVerano(boolean verano) {
        this.verano = verano;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        String mensaje = "Computador{" + "codigo=" + codigo + ", cpu=" + cpu + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", tipoAlmacenamiento=" + tipoAlmacenamiento + ", tipoPantalla=" + tipoPantalla + ", cantPuertosUSB=" + cantPuertosUSB + ", estudianteDuoc=" + estudianteDuoc + ", verano=" + verano + ", costo=" + costo + '}';
        return mensaje;
    }

    public void mostrarDatos() {
        System.out.println("Codigo: "+codigo);
        System.out.println("Cpu: "+cpu);
        System.out.println("Ram: "+ram);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("Tipo de Almacenamiento: "+tipoAlmacenamiento);
        System.out.println("Tipo de Pantalla: "+tipoPantalla);
        System.out.println("Cantidad de puertos USB "+cantPuertosUSB);
        System.out.println("Descuento Estudiante en DuocUC: "+estudianteDuoc);
        System.out.println("Descuento de Verano: "+verano);

    }

    public void mostrarDetalleBoleta() {
        int precioComputador = costo;
        int iva = (int) ( costo * Iva);
        int descuentoDuoc = (int) (costo * DescuentoDuoc);
        int descuentoVerano = (int) (costo * DescuentoVerano);
        int total = (int) (costo + iva - descuentoVerano - descuentoDuoc);
        int totalMasIva= (int) (costo + iva);


        System.out.println("Precio " + precioComputador);
        System.out.println("IVA (" + (Iva * 100) + "%): $" + iva);
        System.out.println("Precio más Iva: " + totalMasIva);
        System.out.println("Descuento Duoc: "+ descuentoDuoc);
        System.out.println("Descuento Verano: " + descuentoVerano);
        System.out.println("Total a Pagar: $" + total);
    }
}
