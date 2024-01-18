package cl.duoc.miservicio.service;

import cl.duoc.miservicio.models.Persona;

public interface IPersonaService {
    public void Guardar(Persona p);
    public void ImprimirListado();
    public void Borrar(int i);
}
