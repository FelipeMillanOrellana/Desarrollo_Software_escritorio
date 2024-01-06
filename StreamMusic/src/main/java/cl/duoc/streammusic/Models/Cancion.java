package cl.duoc.streammusic.Models;

import java.time.LocalTime;

public class Cancion {
    
    private int id;
    private String titulo;
    private String artista;
    private LocalTime duracion;
    private boolean favorita;
    private boolean descargada;
//Constructor
    public Cancion(int id,String titulo, String artista, LocalTime duracion, boolean favorita, boolean descargada) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }
//Constructor vacio
    public Cancion() {
        this.id= 0 ;
        this.titulo = "Nueva Cancion";
        this.artista = "Nuevo Artista";
        this.duracion = LocalTime.now();
        this.favorita = false;
        this.descargada = false;
    }
//Getter and Setter

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        if ( artista.length()>5){
            this.artista = artista;
        }
    }

    public LocalTime getDuracion() {
        return this.duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
    public void setDuracion(int minutos, int segundos){
        this.duracion = duracion;
    }

    public boolean isFavorita() {
        return this.favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return this.descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    //CUSTOM
    @Override
    public String toString(){
        return "Informacion de la canciòn \n" + "-ID: "+this.id + "\n-Titulo: " + this.titulo + "\n-Artista: " 
                + this.artista + "\n-Duracion: " + this.duracion + "\n-Descagada: " + this.descargada+ "\n-Favorita: "+ this.favorita;
        
    }
    
    public void Adelantar (int SegundosAdelantar){
       this.duracion = this.duracion.plusSeconds(SegundosAdelantar);
    }
    public void Retroceder (int segundoRetroceder){
       this.duracion = this.duracion.minusSeconds(segundoRetroceder);
    }
    
    private String getDuracionEnMinutos(){
        return this.duracion.toString();
    }
}
