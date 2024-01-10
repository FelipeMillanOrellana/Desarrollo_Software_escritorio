package cl.duoc.aerolinea;

import cl.duoc.aerolinea.Models.TipoVehiculo;
import cl.duoc.aerolinea.Models.VehiculoAereo;
import java.time.LocalDate;

public class Aerolinea {

    public static void main(String[] args) {
        VehiculoAereo ve = new VehiculoAereo();
        ve.setNombre("Longinus");
        ve.setTipo(TipoVehiculo.Avion);
        ve.setHorasVoladas(22);
        ve.setListoParaVolar(true);
        ve.setTonelaje(0);
        ve.setDatosExtras("Avion muy bonito");
        ve.setFechaUltimoVuelo(LocalDate.of(2024, 01, 15));
        System.out.println(ve);
    }
}
