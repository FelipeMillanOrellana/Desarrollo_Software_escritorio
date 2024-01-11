package cl.duoc.aerolinea;

import cl.duoc.aerolinea.Models.Pasajero;
import cl.duoc.aerolinea.utils.TipoVehiculo;
import cl.duoc.aerolinea.Models.VehiculoAereo;
import cl.duoc.aerolinea.Models.Vuelo;
import cl.duoc.aerolinea.utils.Validacion;

public class Aerolinea {

    public static void main(String[] args) {
        VehiculoAereo ve1 = new VehiculoAereo();
        ve1.setNombre("Longinus");
        ve1.setTipo(TipoVehiculo.Avion);
        ve1.setHorasVoladas(22);
        ve1.setListoParaVolar(true);
        ve1.setTonelaje(0);
        ve1.setDatosExtras("Avion muy bonito");
        ve1.setFechaUltimoVuelo(2024, 01, 15);
        System.out.println(ve1);
    

        VehiculoAereo ve2 = new VehiculoAereo();
        ve2.setNombre("Frank");
        ve2.setTipo(TipoVehiculo.Avioneta);
        ve2.setHorasVoladas(22);
        ve2.setListoParaVolar(true);
        ve2.setTonelaje(0);
        ve2.setDatosExtras("Avion muy bonito");
        ve2.setFechaUltimoVuelo(2023, 03, 21);
        ve2.setUltrasonico(true);
        System.out.println(ve2);
        
        Vuelo vuelito = new Vuelo();
        vuelito.setId(456);
        vuelito.setOrigen("Chile");
        vuelito.setDestino("Perú");
        vuelito.setFecha(2024, 01, 15);
        vuelito.setPiloto("Juanito Gutierrez");
        System.out.println(vuelito);
    
        Pasajero Pedro = new Pasajero();
        System.out.println(Pedro);
        
        System.out.println(Validacion.ValidaEmail("jola.sdsd@gmail.cl"));
        
    }
    
    
}
