/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Pasajero {
    private int run, edad;
    private char dv;
    private String nombre, apellido;

    public Pasajero() {
    }

    public Pasajero(int run, char dv, String nombre, String apellido, int edad) {
        this.run = run;
        this.edad = edad;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void imprimirPasajero(){
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su apellido es " + apellido);
        System.out.println("Su rut es " + run + "-" + dv);
        System.out.println("Su edad es " + edad);
    }
}
