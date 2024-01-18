package cl.duoc.rentcar.Services;

import java.util.ArrayList;
import java.util.List;
import cl.duoc.rentcar.dto.VehiculoDTO;

public class VehiculoService {
    
    private List<VehiculoDTO> lista;
    
    public final List<VehiculoDTO> vehiculos = new ArrayList<>();

    public boolean validarPatente(String patente) {
        for (VehiculoDTO vDTO : vehiculos) {
            if (vDTO.getPatente().equals(patente)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean agregarVehiculo(VehiculoDTO vDTO) {
        if (validarPatente(vDTO.getPatente())) {
            vehiculos.add(vDTO);
            return true;
        } else {
            return false;
        }
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
  
    public void Borrar(VehiculoDTO vDTO){
        this.lista.remove(vDTO);
    }
    public void Borrar(int i){
        this.lista.remove(i);
    }
    public void Editar(VehiculoDTO vDTO, int i){
        this.lista.add(i, vDTO);
    }
    public void ImprimirListado(){
        for (VehiculoDTO vehiculo : vehiculos) {
            System.out.println("Datos del vahiculo");
            System.out.println("==============");
            vehiculo.mostrarDatos();
            System.out.println("--------------");
            System.out.println("Boleta:");
            vehiculo.mostrarDetalleBoleta();
        }
    }
}