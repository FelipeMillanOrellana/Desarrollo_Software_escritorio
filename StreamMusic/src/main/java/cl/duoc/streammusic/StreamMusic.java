package cl.duoc.streammusic;

import cl.duoc.streammusic.Models.Cancion;
import java.time.LocalTime;


public class StreamMusic {

    public static void main(String[] args) {
        Cancion c = new Cancion();
        
        c.setArtista("Hola");
        c.setDuracion(LocalTime.of(00, 03, 30));
        c.setDescargada(true);
        c.setFavorita(true);
        
        
        System.out.println(c);
    }
}
