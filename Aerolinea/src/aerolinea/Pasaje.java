/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Pasaje {
    private int numVuelo, numAsiento, valor;
    private Pasajero pasajero;
    private String destino;
    private Boolean equipaje;
    private LocalDate fecha;
    
    public Pasaje() {
    }

    public Pasaje(int numVuelo, int numAsiento, int valor, Pasajero pasajero, String destino, Boolean equipaje, LocalDate fecha) {
        this.numVuelo = numVuelo;
        this.numAsiento = numAsiento;
        this.valor = valor;
        this.pasajero = pasajero;
        this.destino = destino;
        this.equipaje = equipaje;
        this.fecha = fecha;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Boolean getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Boolean equipaje) {
        this.equipaje = equipaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public Boolean vigenciaPasaje(){
        LocalDate fechaActual = LocalDate.now();
        return !fecha.isBefore(fechaActual);
    }
    
    public Boolean tieneEquipaje(){
        if (equipaje){
            valor += valor * 0.2;
        }
        return equipaje;
    }   
    
    public void imprimirPasaje(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        System.out.println("numero de vuelo " + numVuelo);
        System.out.println("numero asiento " + numAsiento);
        System.out.println("valor " + valor);
        System.out.println("pasajero " + pasajero.getNombre());
        System.out.println("destino " + destino);
        System.out.println("tiene equipaje " + equipaje);
        System.out.println("la fecha es " + fecha.format(formato));
        System.out.println("..................................");
       
    }
}
