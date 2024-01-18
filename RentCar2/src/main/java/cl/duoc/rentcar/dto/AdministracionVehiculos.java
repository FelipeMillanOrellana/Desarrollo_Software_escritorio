package cl.duoc.rentcar.DTO;

import java.util.ArrayList;
import java.util.List;
import cl.duoc.rentcar.dto.VehiculoDTO;
public class AdministracionVehiculos {
    private final List<VehiculoDTO> vehiculos = new ArrayList<>();

    public boolean agregarVehiculo(VehiculoDTO vDTO) {
        if (validarPatente(vDTO.getPatente())) {
            vehiculos.add(vDTO);
            return true;
        } else {
            return false;
        }
    }
    private boolean validarPatente(String patente) {
        for (VehiculoDTO vDTO : vehiculos) {
            if (vDTO.getPatente().equals(patente)) {
                return false;
            }
        }
        return true;
    }
    public List<VehiculoDTO> obtenerVehiculos() {
        return vehiculos;
    }

    public int contarVehiculosArriendoLargo() {
        int count = 0;
        for (VehiculoDTO vDTO : vehiculos) {
            if (vDTO.getCantidadDias() >= 7) {
                count++;
            }
        }
        return count;
    }
}

