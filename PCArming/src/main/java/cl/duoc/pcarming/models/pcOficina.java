package cl.duoc.pcarming.models;

public class pcOficina extends Computador{
    private int consumoEnergetico;

    public pcOficina(int cantFPS, String codigo, String cpu, int ram, String almacenamiento, String tipoAlmacenamiento, String tipoPantalla, int cantPuertosUSB, boolean estudianteDuoc, boolean verano, int costo) {
        super(codigo, cpu, ram, almacenamiento, tipoAlmacenamiento, tipoPantalla, cantPuertosUSB, estudianteDuoc, verano, costo);
        this.consumoEnergetico = consumoEnergetico;
    }

    public pcOficina(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public pcOficina() {
        super();
        this.consumoEnergetico = -1;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "pc Oficina\n" + "Consumo Energetico: " + consumoEnergetico + "khv"+'}';
    }
    
    
}
