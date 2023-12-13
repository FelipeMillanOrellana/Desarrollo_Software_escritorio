package cl.duoc.rentcar;

import cl.duoc.rentcar.DTO.AdministracionVehiculos;
import cl.duoc.rentcar.DTO.VehiculoCargaDTO;
import cl.duoc.rentcar.DTO.VehiculoDTO;
import cl.duoc.rentcar.DTO.VehiculoPasajerosDTO;

import java.util.List;

public class RentCar {
    public static void main(String[] args) {
        AdministracionVehiculos av = new AdministracionVehiculos();

        //Vehículo de carga
        VehiculoCargaDTO vc = new VehiculoCargaDTO();
        vc.setCapacidadCarga(100);
        vc.setPatente("ALO123");
        vc.setPrecioDiario(5000);
        vc.setCantidadDias(15);


        //Vehículo de pasajeros
        VehiculoPasajerosDTO vp = new VehiculoPasajerosDTO();
        vp.setCantidadPasajeros(60);
        vp.setPatente("KKS456");
        vp.setPrecioDiario(7500);
        vp.setCantidadDias(14);


        //Agregar vehículos a la administración
        av.agregarVehiculo(vc);
        av.agregarVehiculo(vp);

        //Mostrar información y boleta
        List<VehiculoDTO> vehiculos = av.obtenerVehiculos();
        for (VehiculoDTO vehiculo : vehiculos) {
            System.out.println("Datos del vahiculo");
            System.out.println("==============");
            vehiculo.mostrarDatos();
            System.out.println("--------------");
            System.out.println("Boleta:");
            vehiculo.mostrarDetalleBoleta();
        }

        //Contar vehículos en arriendo largo
        int vehiculosArriendoLargo = av.contarVehiculosArriendoLargo();
        System.out.println("==============");
        System.out.println("Vehiculos con arriendos largos: " + vehiculosArriendoLargo);
    }
}