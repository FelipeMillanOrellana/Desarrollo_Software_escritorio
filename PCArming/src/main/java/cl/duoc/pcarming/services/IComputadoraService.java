package cl.duoc.pcarming.services;

import cl.duoc.pcarming.models.Computador;
import java.util.List;

public interface IComputadoraService {
    double Iva = 0.19;
    double DescuentoDuoc = 0.03;
    double DescuentoVerano = 0.07;
    
    public boolean validarCodigo(String codigo);
    public boolean agregarComputador(Computador c);
    public List<Computador> obtenerVehiculos();
    public void Borrar(int i);
    public void Editar(Computador c, int i);
    public void ImprimirListado();
}
