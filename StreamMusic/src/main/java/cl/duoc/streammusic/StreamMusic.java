package cl.duoc.streammusic;

import cl.duoc.streammusic.Models.Cancion;
import java.util.ArrayList;
import java.util.List;

public class StreamMusic {

    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.setId(206472);
        c.setTitulo("Residuos");
        c.setArtista("El Bestia Negra");
        c.setDuracion(3,30);
        c.setDescargada(true);
        c.setFavorita(true);
        
        Cancion bn = new Cancion();
        bn.setId(206473);
        bn.setTitulo("Error");
        bn.setArtista("El Bestia Negra");
        bn.setDuracion(3,48);
        bn.setDescargada(true);
        bn.setFavorita(true);
        
        
        List<Cancion> misCanciones = new ArrayList<>();
        misCanciones.add(c);
        misCanciones.add(bn);
        System.out.println(misCanciones);
    }
}
