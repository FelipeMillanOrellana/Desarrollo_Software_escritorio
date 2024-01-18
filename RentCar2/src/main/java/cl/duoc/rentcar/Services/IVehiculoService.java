package cl.duoc.rentcar.Services;

import cl.duoc.rentcar.dto.VehiculoDTO;

public interface IVehiculoService {
    double Iva = 0.19;
    double DescuentoCarga = 0.03;
    double DescuentoPasajero = 0.07;
    
    public boolean agregarVehiculo(VehiculoDTO vDTO);
    public void Borrar(int i);
    public void ImprimirListado();
    public int contarVehiculosArriendoLargo();
    public boolean validarPatente(String patente);
    public void Editar(VehiculoDTO vDTO, int i);

}

