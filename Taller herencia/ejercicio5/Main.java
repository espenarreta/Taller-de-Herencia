/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author utpl
 */
public class Main {

    public static void main(String[] args) {
        Habitacion[] habitaciones = new Habitacion[3];
        habitaciones[0] = new Suite("505", 300.0, true);
        habitaciones[1] = new Familiar("202", 180.0, 2);
        habitaciones[2] = new Estandar("303", 120.0, false);

        System.out.println("----Sistema de Reservas de Hotel----");

        for(int i = 0; i < habitaciones.length; i++) {
            Habitacion hab = habitaciones[i];
            System.out.println(hab.mostrarInfo());
            System.out.println("--------------------------");
        }
    }
}
