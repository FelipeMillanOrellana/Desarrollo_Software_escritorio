package cl.duoc.bancarota.DTO;


public class DepositoDTO {
    private String rut;
    private String tipoCuenta;
    private String tipoTransaccion;

    public DepositoDTO(String rut, String tipoCuenta, String tipoTransaccion) {
        this.rut = rut;
        this.tipoCuenta = tipoCuenta;
        this.tipoTransaccion = tipoTransaccion;
    }

    public DepositoDTO() {
        this.rut = "";
        this.tipoCuenta = "";
        this.tipoTransaccion = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String Rut) {
        this.rut = Rut;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return  "Rut: " + rut + "\nTipoCuenta: " + tipoCuenta + "\nTipo de Transacción: " + tipoTransaccion ;
    }
    
}
