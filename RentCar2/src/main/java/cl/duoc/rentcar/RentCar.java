package cl.duoc.rentcar;

import cl.duoc.rentcar.Services.VehiculoService;
import cl.duoc.rentcar.dto.VehiculoCargaDTO;
import cl.duoc.rentcar.dto.VehiculoDTO;
import cl.duoc.rentcar.dto.VehiculoPasajerosDTO;
import java.util.List;

public class RentCar {
    public static void main(String[] args) {
        VehiculoService vs= new VehiculoService();

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
        vs.agregarVehiculo(vc);
        vs.agregarVehiculo(vp);

        //Mostrar información y boleta
        List<VehiculoDTO> vehiculos = vs.obtenerVehiculos();
        for (VehiculoDTO vehiculo : vehiculos) {
            System.out.println("Datos del vahiculo");
            System.out.println("==============");
            vehiculo.mostrarDatos();
            System.out.println("--------------");
            System.out.println("Boleta:");
            vehiculo.mostrarDetalleBoleta();
        }

        //Contar vehículos en arriendo largo
        int vehiculosArriendoLargo = vs.contarVehiculosArriendoLargo();
        System.out.println("==============");
        System.out.println("Vehiculos con arriendos largos: " + vehiculosArriendoLargo);
    }
}
