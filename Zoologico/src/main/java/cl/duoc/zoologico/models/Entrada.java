package cl.duoc.zoologico.models;

import java.time.LocalDate;

public class Entrada {
    private int codigoEntrada;
    private Visitante visitante;
    private String tipoDeEntrada;
    private LocalDate fecha;
    private double valor;
    private boolean incluyeColacion; 

    public Entrada(int codigoEntrada, Visitante visitante, String tipoDeEntrada, LocalDate fecha, double valor, boolean incluyeColacion) {
        this.codigoEntrada = codigoEntrada;
        this.visitante = visitante;
        this.tipoDeEntrada = tipoDeEntrada;
        this.fecha = fecha;
        this.valor = valor;
        this.incluyeColacion = incluyeColacion;
    }

    public Entrada() {
        this.codigoEntrada = -1;
        this.visitante = new Visitante();
        this.tipoDeEntrada = "";
        this.fecha = LocalDate.now();
        this.valor = -1;
        this.incluyeColacion = false;
    }

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isIncluyeColacion() {
        return incluyeColacion;
    }

    public void setIncluyeColacion(boolean incluyeColacion) {
        this.incluyeColacion = incluyeColacion;
    }

    @Override
    public String toString() {
        return "Entrada{" + "codigoEntrada=" + codigoEntrada + ", visitante=" + visitante + ", tipoDeEntrada=" + tipoDeEntrada + ", fecha=" + fecha + ", valor=" + valor + ", incluyeColacion=" + incluyeColacion + '}';
    }
    
}
