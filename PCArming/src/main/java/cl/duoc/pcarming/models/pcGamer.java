
package cl.duoc.pcarming.models;

public class pcGamer extends Computador{
    private int cantFPS;

    public pcGamer(int cantFPS, String codigo, String cpu, int ram, String almacenamiento, String tipoAlmacenamiento, String tipoPantalla, int cantPuertosUSB, boolean estudianteDuoc, boolean verano, int costo) {
        super(codigo, cpu, ram, almacenamiento, tipoAlmacenamiento, tipoPantalla, cantPuertosUSB, estudianteDuoc, verano, costo);
        this.cantFPS = cantFPS;
    }

    public pcGamer(int cantFPS) {
        this.cantFPS = cantFPS;
    }

    public pcGamer() {
        super();
        this.cantFPS = -1;
    }

    public int getCantFPS() {
        return cantFPS;
    }

    public void setCantFPS(int cantFPS) {
        this.cantFPS = cantFPS;
    }

    @Override
    public String toString() {
        return "pc Gamer\n" + "cantFPS: " + cantFPS + '}';
    }
    
    
}
