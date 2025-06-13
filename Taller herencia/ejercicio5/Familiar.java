/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author utpl
 */
public class Familiar extends Habitacion {
    int capacidadN;

    public Familiar(String numero, double precioPorNoche, int capacidadN) {
        super(numero, precioPorNoche);
        this.capacidadN = capacidadN;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Capacidad para " + capacidadN + " niños";
    }
}
