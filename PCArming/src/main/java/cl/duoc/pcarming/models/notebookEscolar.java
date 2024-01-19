package cl.duoc.pcarming.models;

public class notebookEscolar extends Computador{
    
    private int Garantia;

    public notebookEscolar(int Garantia, String codigo, String cpu, int ram, String almacenamiento, String tipoAlmacenamiento, String tipoPantalla, int cantPuertosUSB, boolean estudianteDuoc, boolean verano, int costo) {
        super(codigo, cpu, ram, almacenamiento, tipoAlmacenamiento, tipoPantalla, cantPuertosUSB, estudianteDuoc, verano, costo);
        this.Garantia = Garantia;
    }

    public notebookEscolar(int Garantia) {
        this.Garantia = Garantia;
    }

    public notebookEscolar() {
        super();
        this.Garantia = -1;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    @Override
    public String toString() {
        return "notebook Escolar\n" + "Garantia: " + Garantia + " año/s" +'}';
    }
   
}
