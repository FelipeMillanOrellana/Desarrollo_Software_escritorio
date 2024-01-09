//código, subcategoría, descripción, precio, medida (unidad o gramos) y su cantidad.

package cl.duoc.verduleria.Models;

public class Producto {
    private int codigo;
    private String subcategoria;
    private String descripcion;
    private int precio;
    private UnidadMedida medida_id;
    private float cantidad;

    public Producto(int codigo, String subcategoria, String descripcion, int precio, float medidad, UnidadMedida medida_id) {
        this.codigo = codigo;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.medida_id = medida_id;
        this.cantidad = cantidad;
    }

    public Producto() {
        this.codigo = 0;
        this.subcategoria = "";
        this.descripcion = "";
        this.precio = 0;
        this.medida_id = UnidadMedida.Gramos;
        this.cantidad = 0f;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSubcategoria() {
        return this.subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public UnidadMedida getMedida_id() {
        return this.medida_id;
    }

    public void setMedida_id(UnidadMedida medida_id) {
        this.medida_id = medida_id;
    }

    public float getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        String mensaje = descripcion +" $"+precio+" "+cantidad+" "+medida_id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ;
        return mensaje;  
    }
    
    
}
