package cl.duoc.aerolinea.Models;

import java.time.LocalDate;

public class Pasaje {
    private int id;
    private Pasajero pasajero;
    private LocalDate fecha;
    private int codigoVuelo;
    private int valor;
    private TipoVehiculo aeronave;

    public Pasaje(int id, Pasajero pasajero, LocalDate fecha, int codigoVuelo, int valor, TipoVehiculo aeronave) {
        this.id = id;
        this.pasajero = pasajero;
        this.fecha = fecha;
        this.codigoVuelo = codigoVuelo;
        this.valor = valor;
        this.aeronave = aeronave;
    }

    public Pasaje() {
        this.id = -1;
        this.pasajero = new Pasajero();
        this.fecha = LocalDate.now();
        this.codigoVuelo = 0;
        this.valor = 0;
        this.aeronave = TipoVehiculo.Avion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(int codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoVehiculo getAeronave() {
        return aeronave;
    }

    public void setAeronave(TipoVehiculo aeronave) {
        this.aeronave = aeronave;
    }
    
    
}
