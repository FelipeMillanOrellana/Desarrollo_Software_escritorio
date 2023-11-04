package cl.duoc.rentcar;

import cl.duoc.rentcar.DTO.AdministracionVehiculos;
import cl.duoc.rentcar.DTO.VehiculoCargaDTO;
import cl.duoc.rentcar.DTO.VehiculoDTO;
import cl.duoc.rentcar.DTO.VehiculoPasajerosDTO;

import java.util.List;

public class RentCar {
    public static void main(String[] args) {
        AdministracionVehiculos gestionVehiculos = new AdministracionVehiculos();

        VehiculoCargaDTO vehiculoCarga = new VehiculoCargaDTO(100, "ABC123", 5, 2000);
        VehiculoPasajerosDTO vehiculoPasajeros = new VehiculoPasajerosDTO(80, "XYZ456", 7, 4);

        gestionVehiculos.agregarVehiculo(vehiculoCarga);
        gestionVehiculos.agregarVehiculo(vehiculoPasajeros);

        List<VehiculoDTO> vehiculos = gestionVehiculos.obtenerVehiculos();
        for (VehiculoDTO vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
            vehiculo.mostrarDetalleBoleta();
        }

        int vehiculosArriendoLargo = gestionVehiculos.contarVehiculosArriendoLargo();
        System.out.println("Cantidad de vehículos en arriendo largo: " + vehiculosArriendoLargo);
        }
}