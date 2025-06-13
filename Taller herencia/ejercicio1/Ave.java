/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author utpl
 */
public class Ave extends Animales {

    public Ave(String volar, String nombre, String tipoAlimento, int edad) {
        super(nombre, tipoAlimento, edad);
        this.volar = volar;
    }
    public String volar;

    public void mostrarInformacion() {
      
        System.out.println("El nombre del ave es: " + nombre);
        System.out.println("El tipo de alimento del ave es: " + tipoAlimento);
        System.out.println("La edad del ave es de " + edad + " años:");
        System.out.println("Cual es el comportamiento del ave " + volar);
        System.out.println("------------------------");
    }
}
