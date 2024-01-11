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
        this.origen = "Sin origen definido";
        this.destino = "Sin origen definido";
        this.fecha = LocalDate.now();
        this.piloto = "Sin piloto designado";
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
    public void setFecha(int anio, int mes, int dia) {
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
            String mensaje = "Informacion de Vuelo"+"\nId : #"+id+"\nOrigen: "+origen+"\nDestino: "+destino+"\nFecha: "+fecha+"\nPiloto: "+piloto;
        return mensaje;
    }
    
    
}
