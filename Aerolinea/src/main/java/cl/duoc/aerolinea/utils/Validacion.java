package cl.duoc.aerolinea.utils;

import java.time.LocalDate;

public class Validacion {
    public static boolean ValidaEmail(String correo){
        //&& = y
        //|| = o
        return(correo.contains("@") && correo.contains("."));
    }
    public static boolean ValidaTelefono(long telefono){
        return ((telefono+"").length()==9);
    }
    
    public static boolean ValidaRut(int rut, char dv){

    boolean validacion = false;
    try {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

    } catch (java.lang.NumberFormatException e) {
    } catch (Exception e) {
    }
    return validacion;
    }
    
    public static boolean Vaildafecha(LocalDate fecha){
        return fecha.isBefore(LocalDate.now());
    }
}