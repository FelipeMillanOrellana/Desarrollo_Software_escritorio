package cl.duoc.pcarming.services;

import cl.duoc.pcarming.models.Computador;
import java.util.ArrayList;
import java.util.List;

public class ComputadoraService {
    
    private List<Computador> lista;
    
    public final List<Computador> computador = new ArrayList<>();

    public boolean validarCodigo(String codigo){
            for (Computador c : computador) {
                if (c.getCodigo().equals(codigo)) {
                    return false;
                }
            }
            return true;
        }
        public boolean agregarComputador(Computador c){
            if (validarCodigo(c.getCodigo())) {
                computador.add(c);
                return true;
            } else {
                return false;
            }
        }
        
        public List<Computador> obtenerComputadores() {
            return computador;
        }

        public void Borrar(Computador c) {
            this.lista.remove(c);
        }
        public void Borrar(int i){
            this.lista.remove(i);
        }
        public void Editar(Computador c, int i){
            this.lista.add(i, c);
        }
        public void ImprimirListado(){
            for (Computador compu : computador) {
                System.out.println("Datos del PC");
                System.out.println("==============");
                compu.mostrarDatos();
                System.out.println("--------------");
                System.out.println("Boleta:");
                compu.mostrarDetalleBoleta();
            }
        }
    }
