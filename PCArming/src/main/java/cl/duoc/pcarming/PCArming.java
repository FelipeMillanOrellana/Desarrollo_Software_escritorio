package cl.duoc.pcarming;

import cl.duoc.pcarming.models.Computador;
import cl.duoc.pcarming.models.pcGamer;
import cl.duoc.pcarming.services.ComputadoraService;
import java.util.List;

public class PCArming {

    public static void main(String[] args) {
        ComputadoraService cs = new ComputadoraService();
        /*private String codigo;
    private String cpu;
    private int ram;
    private int almacenamiento;
    private String tipoAlmacenamiento;
    private String tipoPantalla;
    private int cantPuertosUSB;
    private boolean estudianteDuoc;
    private boolean verano;
    private int costo;*/
        
        pcGamer pcG = new pcGamer();
        System.out.println(pcG);
        pcG.setCodigo("G200");
        pcG.setCantFPS(60);
        pcG.setCpu("Ryzen 7");
        pcG.setRam(16);
        pcG.setAlmacenamiento("2 Terabytes");
        pcG.setTipoAlmacenamiento("SSD");
        pcG.setTipoPantalla("No incluye");
        pcG.setCantPuertosUSB(4);
        pcG.setEstudianteDuoc(true);
        pcG.setVerano(true);
        pcG.setCosto(880000);
        

        cs.agregarComputador(pcG);
        
        List<Computador> computador = cs.computador;
        for (Computador compu : computador) {
            System.out.println("Datos de la PC");
            System.out.println("==============");
            compu.mostrarDatos();
            System.out.println("--------------");
            System.out.println("Boleta:");
            compu.mostrarDetalleBoleta();
        }
    }
}
