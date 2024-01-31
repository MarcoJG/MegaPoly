/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prMegapoly;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.sql.rowset.spi.SyncFactory;

/**
 *
 * @author Marco Janicijevic Guardado, DAW 1º Pacífico, 26262825E
 */
public class Jugador {
    //Atributos
    protected String nombre_jugador;
    protected double dineros;
    
    //Constructor por parámetro de nombre del jugador (el que más se usará)
    public Jugador(){
        
    }
    
    public Jugador (String nombre_jugador, double dineros){
        
        Set <String>error = new HashSet<>();
        Double dinerosDouble = dineros;
        if (nombre_jugador == null || nombre_jugador.isBlank()) error.add("El nombre no puede estar vacío");
        if (dineros <= 0 || dineros>= 100) error.add("Edad fuera del rango válido");
        if (dinerosDouble instanceof Number) error.add("Error. Debe ser un número");
        if (!error.isEmpty()) error.toString();
    }
    
    public String getNombre_jugador(){
        return nombre_jugador;
    }
    
    public double getDineros(){
        return dineros;
    }
    
    //Setters
    public void setNombre_jugador(String nombre_jugador){
        //Vamos manejando las excepciones aquí en vez de elevarlas a la clase main
        if (nombre_jugador == null || nombre_jugador.isBlank()) 
            throw new MegapolyException("El nombre del jugador está vacío");
        //End if
        this.nombre_jugador = nombre_jugador;
    }
    
    //toString() para generar secuencias de caracteres
    @Override
    public String toString(){
        return nombre_jugador + dineros;
    }
    
    //Hashcode necesario para que equals no de la lata, ordena los elementos por un código generado único
    @Override
    public int hashCode(){
        return this.nombre_jugador.toLowerCase().hashCode();
    }
    
    //Método equals para comparar si dos objetos son IDÉNTICOS, devuelve TRUE en caso de que lo sean
    @Override
    public boolean equals(Object obj){
        boolean ok = this == obj;
        if (!ok && obj instanceof Jugador){
            Jugador aux = (Jugador) obj;
            ok = this.nombre_jugador.equalsIgnoreCase(aux.nombre_jugador);
        }//End if
        return ok;
    }
    
    public int lanzar_dado(){
        Random rnd = new Random();
        int tirada_de_dado = rnd.nextInt(6) + 1; //Random genera números de 0 en adelante, sumamos 1 para que sea entre 1 y 6.
        
        return tirada_de_dado;
    }
   
}
