package cl.duoc.aerolinea.Models;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private String piloto;

    public Vuelo(int id, String origen, String destino, LocalDate fecha, String piloto) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }

    public Vuelo() {
        this.id = -1;
        this.origen = "";
        this.destino = "";
        this.fecha = LocalDate.now();
        this.piloto = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
}
