/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cs1daw.ejercicios08;

import com.mitaller.entidades.*;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author alumno
 */
public class Ejercicios08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        parte1();
    }
    
    public static void parte1(){
        Taller t1 = new Taller("Mecánica del motor S. L.");
        Mecanico m1 = new Mecanico("M345698K", "33345565G","Juan Pérez", 1500);
        Mecanico m2 = new Mecanico("M456123K", "765412343N","Ángela Estévez", 1600);
        Mecanico m3 = new Mecanico("M876123M", "24351981H","Adri Velasco", 1400);
        Coche c1 = new Coche("3464JVM","Seat","Ibiza",120, LocalDate.of(0, Month.MARCH, 0));
        
    }
    
}
