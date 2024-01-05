package cl.duoc.streammusic.Models;

import java.time.LocalTime;

public class Cancion {
    public String titulo;
    public String artista;
    public LocalTime duracion;
    private boolean favorita;
    private boolean descargada;

    public Cancion(String titulo, String artista, LocalTime duracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.duracion = LocalTime.of(00, 00, 00);
        this.favorita = false;
        this.descargada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
}
