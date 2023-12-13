package Service;

import DTO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service implements CrudService<MascotaDTO> {
    private List<MascotaDTO> mascotas;

    public Service() {
        this.mascotas = new ArrayList<>();
    }

    @Override
    public void guardar(MascotaDTO mascota) {
        mascotas.add(mascota);
    }

    @Override
    public void editar(MascotaDTO mascotaEditada) {
        Optional<MascotaDTO> mascotaExistente = mascotas.stream()
                .filter(mascota -> mascota.getNombre().equals(mascotaEditada.getNombre()))
                .findFirst();

        if (mascotaExistente.isPresent()) {
            MascotaDTO mascotaEncontrada = mascotaExistente.get();
            // Actualizar los datos de la mascota encontrada con los datos de la mascota editada
            mascotaEncontrada.setTipo(mascotaEditada.getTipo());
            // Actualiza otros atributos según sea necesario
        }
    }

    @Override
    public List<MascotaDTO> listar() {
        return mascotas;
    }

    @Override
    public MascotaDTO buscarPorId(long id) {
        // En este ejemplo, suponemos que la "id" es el nombre de la mascota.
        Optional<MascotaDTO> mascotaEncontrada = mascotas.stream()
                .filter(mascota -> mascota.getNombre().equals(String.valueOf(id)))
                .findFirst();
        
        return mascotaEncontrada.orElse(null);
    }

    @Override
    public void eliminar(long id) {
        // En este ejemplo, suponemos que la "id" es el nombre de la mascota.
        mascotas.removeIf(mascota -> mascota.getNombre().equals(String.valueOf(id)));
    }
}
