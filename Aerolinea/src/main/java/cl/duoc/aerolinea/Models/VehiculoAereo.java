package cl.duoc.aerolinea.Models;

import cl.duoc.aerolinea.utils.TipoVehiculo;
import java.time.LocalDate;

public class VehiculoAereo {
    
    private static int idGlobal=100;
    
    private int id;
    private String nombre;
    private TipoVehiculo tipo;
    private int horasVoladas;
    private boolean listoParaVolar;
    private int tonelaje;
    private boolean ultrasonico;
    private String datosExtras;
    private LocalDate fechaUltimoVuelo;

    public VehiculoAereo(int id, String nombre, TipoVehiculo tipo, int horasVoladas, boolean listoParaVolar, int tonelaje, String datosExtras, LocalDate fechaUltimoVuelo) {
        this.id = idGlobal;
        idGlobal = idGlobal+10;
        this.nombre = nombre;
        this.tipo = tipo;
        this.horasVoladas = horasVoladas;
        this.listoParaVolar = listoParaVolar;
        this.tonelaje = tonelaje;
        this.ultrasonico = ultrasonico;
        this.datosExtras = datosExtras;
        this.fechaUltimoVuelo = fechaUltimoVuelo;
    }

    public VehiculoAereo() {
        this.id = -1;
        this.nombre = "";
        this.tipo = tipo.SinTipo;
        this.horasVoladas = -1;
        this.listoParaVolar = false;
        this.tonelaje = -1;
        this.ultrasonico = false;
        this.datosExtras = "";
        this.fechaUltimoVuelo = LocalDate.now();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public int getHorasVoladas() {
        return horasVoladas;
    }

    public void setHorasVoladas(int horasVoladas) {
        this.horasVoladas = horasVoladas;
    }

    public boolean isListoParaVolar() {
        return listoParaVolar;
    }

    public void setListoParaVolar(boolean listoParaVolar) {
        this.listoParaVolar = listoParaVolar;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public String getDatosExtras() {
        return datosExtras;
    }

    public void setDatosExtras(String datosExtras) {
        this.datosExtras = datosExtras;
    }

    public LocalDate getFechaUltimoVuelo() {
        return fechaUltimoVuelo ;
    }

    public void setFechaUltimoVuelo(LocalDate fechaUltimoVuelo) {
        this.fechaUltimoVuelo = LocalDate.now();
    }
    public void setFechaUltimoVuelo(int anio, int mes, int dia) {
        this.fechaUltimoVuelo = LocalDate.of(anio, mes, dia);
    }

    public static int getIdGlobal() {
        return idGlobal;
    }

    public static void setIdGlobal(int idGlobal) {
        VehiculoAereo.idGlobal = idGlobal;
    }

    public boolean isUltrasonico() {
        return ultrasonico;
    }

    public void setUltrasonico(boolean ultrasonico) {
        this.ultrasonico = ultrasonico;
    }

    @Override
    public String toString() {
        String mensaje = "-ID: #"+idGlobal+"\n-Nombre: "+nombre+"\n-Tipo aeronave: "+tipo+"\n-Horas voladas: "+horasVoladas+"\n-Listo Para Volar: "+listoParaVolar+"\n-Fecha ultimo vuelo: "+fechaUltimoVuelo;
      
        if (tipo.equals(tipo.Carguero)){
            
            return mensaje+="\n-Tonelaje: "+tonelaje;
        }
        else if(tipo.equals(tipo.Avioneta)){
            return mensaje+="\n-Ulta Sonico: "+ultrasonico;
        }
        else if(tipo.equals(tipo.Avion)){
            return mensaje+="\n-Datos extras: "+datosExtras;
        }
        return mensaje;
    }
}
