/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aerolinea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Aerolinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rut, edad;
        char dv;
        boolean equipaje;
        String nombre, apellido;
        equipaje = false;
        int op = 0;
        
        Scanner lector = new Scanner(System.in);
        Validaciones val = new Validaciones();
        Pasajero pasajero = null;
        Pasaje pasaje = null;
        
        do {

        
        System.out.println("\t AEROLINEA");
        System.out.println(".......................................");
        
        System.out.println("Ingrese su rut (sin digito verificador)");
        rut = lector.nextInt();
        if (val.validarRut(rut)){
            System.out.println("Ingrese digito verificador: ");
            dv = lector.next().charAt(0);
            if (val.validarDV(dv)){
                System.out.println("Ingrese su nombre: ");
                nombre = lector.nextLine();
                nombre = lector.nextLine();
                if (val.validarNombre(nombre)){
                    System.out.println("Ingrese su apellido: ");
                    apellido = lector.nextLine();
                    if(val.validarApellido(apellido)){
                        System.out.println("Ingrese edad: ");
                        edad = lector.nextInt();
                        
                        pasajero = new Pasajero(rut, dv, nombre, apellido, edad);
                        System.out.println(".......................................");
                        
                        System.out.println("Ingrese numero de vuelo: ");
                        int numVuelo = lector.nextInt();
                        
                        System.out.println("Ingrese numero de asiento: ");
                        int numAsiento = lector.nextInt();
                        
                        if (val.validarAsiento(numAsiento)){
                            System.out.println("Ingrese valor de pasaje: ");
                            int valor = lector.nextInt();
                            if (val.validarValor(valor)){
                                System.out.println("Ingrese destino: ");
                                String destino = lector.nextLine();
                                destino = lector.nextLine();
                                
                                System.out.println("Tiene equipaje? ");
                                String equi;
                                equi = lector.nextLine();
                                if (equi.equals("si")){                                   
                                    equipaje = true;
                                    
                                }else if(equi.equals("no")){
                                    equipaje = false;
                                }
                                System.out.println("Ingrese la fecha de su pasaje: ");
                                String fechaIngre = lector.nextLine();
                                
                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                LocalDate fecha = LocalDate.parse(fechaIngre, formato);
                                
                                pasaje = new Pasaje(numVuelo, numAsiento, valor, pasajero, destino, equipaje, fecha);
                                
                                
                            }else {
                                System.out.println("Valor invalido.");
                            }
                        } else {
                            System.out.println("Asiento invalido.");
                        }                   
                        
                    }else {
                        System.out.println("Apellido invalido.");
                    }                   
                }else {
                    System.out.println("Nombre invalido.");
                }
            }else{
                System.out.println("Digito verificador invalido.");
            }
        }else {
             System.out.println("Rut invalido.");
        } 
            System.out.println("1. Ver pasajero");
            System.out.println("2. Ver detalles de vuelo");
            System.out.println("3. Salir");
            op = lector.nextInt();
            
            switch (op){
                case 1: 
                    pasajero.imprimirPasajero();
                    break;
                case 2:
                    pasaje.imprimirPasaje();
                    break;
                case 3:
                    System.out.println("Hasta luego.");
                    break;
            }
            
        } while (op != 3);
        
    }
}

