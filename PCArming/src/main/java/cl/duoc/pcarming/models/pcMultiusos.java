package cl.duoc.pcarming.models;

public class pcMultiusos extends Computador {
    
    private String descripcion;

    public pcMultiusos(int cantFPS, String codigo, String cpu, int ram, String almacenamiento, String tipoAlmacenamiento, String tipoPantalla, int cantPuertosUSB, boolean estudianteDuoc, boolean verano, int costo) {
        super(codigo, cpu, ram, almacenamiento, tipoAlmacenamiento, tipoPantalla, cantPuertosUSB, estudianteDuoc, verano, costo);
        this.descripcion = descripcion;
    }

    public pcMultiusos(String descripcion) {
        this.descripcion = descripcion;
    }

    public pcMultiusos() {
        super();
        this.descripcion = "Sin descripción";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "pc Multiusos\n" + "Descripcion: " + descripcion + '}';
    }
    
    
}
