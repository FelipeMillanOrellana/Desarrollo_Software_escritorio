package cl.duoc.streammusic;

import cl.duoc.streammusic.Models.Cancion;

public class StreamMusic {

    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.setId(206472);
        c.setTitulo("Residuos");
        c.setArtista("El Bestia Negra");
        c.setDuracion(3,30);
        c.setDescargada(true);
        c.setFavorita(true);
        System.out.println(c);
    }
}
