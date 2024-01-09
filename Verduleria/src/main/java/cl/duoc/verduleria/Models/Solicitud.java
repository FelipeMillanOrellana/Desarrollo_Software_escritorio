package cl.duoc.verduleria.Models;

import java.time.LocalDate;

public class Solicitud {
    
    private static int idGlobal =0;
    
    private int numeroSolicitud;
    private LocalDate fecha;
    private Cliente cliente;
    private float total;
    private String productos;

    public Solicitud(int numeroSolicitud, LocalDate fecha, Cliente cliente, float total, String productos) {
        this.idGlobal = idGlobal;
        this.numeroSolicitud = numeroSolicitud;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.productos = productos;
    }

    public Solicitud() {
        this.numeroSolicitud = idGlobal;
        this.idGlobal++;
        this.numeroSolicitud = 0;
        this.fecha = LocalDate.now();
        this.cliente = new Cliente();
        this.total = 0f;
        this.productos = "";
    }

    public int getNumeroSolicitud() {
        return this.numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getProductos() {
        return this.productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    public void AgregarProducto(String detalleProducto){
        this.productos += detalleProducto +"; ";
    }
    
    public String ObteneDetallePedido(){
        String mensaje = "Pedido nro."+ this.numeroSolicitud;
        mensaje += "\nFecha: "+this.fecha.toString();
        mensaje += "\nCliente: "+this.cliente;
        mensaje += "\nTotal: "+this.total;
        mensaje += "\nProductos: "+this.productos;
        return mensaje;
    }
}
