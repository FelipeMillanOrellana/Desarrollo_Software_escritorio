package cl.duoc.rentcar.DTO;

    import java.util.ArrayList;
    import java.util.List;

public class AdministracionVehiculos {
    private final List<VehiculoDTO> vehiculos = new ArrayList<>();

public boolean agregarVehiculo(VehiculoDTO vehiculo) {
    if (validarPatenteUnica(vehiculo.getPatente())) {
        vehiculos.add(vehiculo);
        return true; // El vehículo se agregó correctamente
    } else {
        return false; // La patente ya existe en la lista
    }
}

private boolean validarPatenteUnica(String patente) {
    for (VehiculoDTO vehiculo : vehiculos) {
        if (vehiculo.getPatente().equals(patente)) {
            return false; // La patente ya existe en la lista
        }
    }
    return true; // La patente es única y se puede agregar
}

public List<VehiculoDTO> obtenerVehiculos() {
    return vehiculos;
}
public int contarVehiculosArriendoLargo() {
    int count = 0;
    for (VehiculoDTO vehiculo : vehiculos) {
        if (vehiculo.getCantidadDias() >= 7) {
            count++;
        }
    }
    return count;
    }
}
