package cl.duoc.miservicio;

import cl.duoc.miservicio.models.Persona;
import cl.duoc.miservicio.service.IPersonaService;
import cl.duoc.miservicio.service.PersonaService;
import java.util.ArrayList;
import java.util.List;

public class MiServicio {

    public static void main(String[] args) {
        Persona p = new Persona(1,"Sebastian","Contreras");
        Persona p2 = new Persona(2,"David","Bisval");
        
        System.out.println(p);
        System.out.println(p2);
        
        List<Persona> lista =new ArrayList();
        lista.add(p);
        lista.add(p2);
        System.out.println(lista);
        
        IPersonaService app = new PersonaService();
        app.Guardar(p);
        app.Guardar(p2);
        
        app.ImprimirListado();
        
        app.Borrar(1);
        app.ImprimirListado();
    }
}
