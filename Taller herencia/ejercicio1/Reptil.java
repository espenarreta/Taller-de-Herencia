/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author utpl
 */
public class Reptil extends Animales {

    public Reptil(String reptar, String nombre, String tipoAlimento, int edad) {
        super(nombre, tipoAlimento, edad);
        this.reptar = reptar;
    }
    public String reptar;

    public void mostrarInformacion() {
        System.out.println("El nombre del reptil es: " + nombre);
        System.out.println("El tipo de alimento del reptil es: " + tipoAlimento);
        System.out.println("La edad del reptil es de " + edad + " años:");
        System.out.println("Cual es el comportamiento del reptil es: " + reptar);
    }
}
