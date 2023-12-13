package DTO;

import java.time.LocalDateTime;

public class AtencionDTO {
    private LocalDateTime fecha;
    private String tipoAtencion;
    private String SalaDisponible;

    public AtencionDTO(LocalDateTime fecha, String tipoAtencion, String salaDisponible) {
        this.fecha = fecha;
        this.tipoAtencion = tipoAtencion;
        this.SalaDisponible = salaDisponible;
    }

    public AtencionDTO() {
        this.fecha = fecha;
        this.tipoAtencion = "";
        this.SalaDisponible = "";
    }
        
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getDescripcion() {
        return SalaDisponible;
    }

    public void setDescripcion(String descripcion) {
        this.SalaDisponible = descripcion;
    }
}
