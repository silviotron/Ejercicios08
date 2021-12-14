/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cs1daw.ejercicios08;

import com.mitaller.entidades.*;
import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Ejercicios08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tallerProgram();
    }
    
    public static void tallerProgram(){
        
        //Parte 1: Declaración e instanciación
        
        Taller t1 = new Taller("Mecánica del motor S. L.");
        Mecanico m1 = new Mecanico("M345698K", "33345565G","Juan Pérez", 1500);
        Mecanico m2 = new Mecanico("M456123K", "32654123B","Ángela Estévez", 1600);
        Mecanico m3 = new Mecanico("M876123M", "24351981H","Adri Velasco", 1400);
        
        Coche c1 = new Coche("3464JVM","Seat","Ibiza", 120, LocalDate.of(2007, 4, 12));
        Coche c2 = new Coche("8761MKJ","Opel","Astra", 150, LocalDate.of(2014, 9, 15));
        Coche c3 = new Coche("1234CBM","Ford","Mondeo", 100, LocalDate.of(2001, 5, 3));
        
        Reparacion r1 = new Reparacion(c1, "pinchazo", LocalDate.of(2021, 6, 12));
        Reparacion r2 = new Reparacion(c2, "pérdida de líquido refrigerante", LocalDate.of(2021, 7, 15));
        Reparacion r3 = new Reparacion(c3, "pérdida de potencia", LocalDate.of(2021, 9, 22));
        
        //Parte 2: Manipulación de objetos
        
        c1.viajar(100);
        c1.viajar(200);
        c1.viajar(1200);
        
        c2.viajar(500);
        c2.viajar(200);
        
        c3.viajar(100);
        c3.viajar(45);
        c3.viajar(700);
        c3.viajar(200);
        
        t1.addMecanico(m1);
        t1.addMecanico(m2);
        t1.addMecanico(m3);
        
        r1.reparar("parcheo", LocalDate.of(2021, 6, 15), m1, 15);
        r2.reparar("Cambio de filtro de aceite", LocalDate.of(2021, 6, 15), m2, 587.55);
        r3.reparar("cambio del sistema de Turbo", LocalDate.of(2021, 9, 30), m3, 2301.50);
        
        t1.addReparacion(r1);
        t1.addReparacion(r2);
        t1.addReparacion(r3);
        
        System.out.printf("Coste total reparaciones: %,.2f€\n",t1.getImporteReparaciones());
        System.out.printf("Coste total salarios: %,.2f€\n",t1.getSalarioTrabajadores());
        t1.incrementarSalario(3);
        System.out.printf("Coste total salarios: %,.2f€\n",t1.getSalarioTrabajadores());
        
        
        
        
        
        
    }
    
}
