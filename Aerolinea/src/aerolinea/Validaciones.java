/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Validaciones {
    public boolean validarNombre(String nombre){
        return nombre.length() > 0;
    }
    public boolean validarApellido(String apellido){
        return apellido.length() > 0;
    }
    public boolean validarRut(int run) {
        String rut = String.valueOf(run);

        return rut.length() >= 7 && rut.length() <= 8;
    }
    public boolean validarDV(char dv){
        int digv = Character.getNumericValue(dv);
        
        if(digv <= 9 && digv > 0){
            return true;
        } else return dv == 'K';
    }
    
    public boolean validarValor(int valor){
        return valor > 10000;
    }
    public boolean validarAsiento(int numAsiento){
        return numAsiento >= 1 && numAsiento <= 90;
    }
}
