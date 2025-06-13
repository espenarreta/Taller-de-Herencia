/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author utpl
 */
public class Habitacion {
    String numero;
    double precioPorNoche;

    public Habitacion(String numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }
    
    public String mostrarInfo() {
        return "Habitación " + numero + ", Precio por noche: $" + precioPorNoche;
    }
}
