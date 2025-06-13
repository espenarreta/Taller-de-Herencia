/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author utpl
 */
public class Suite extends Habitacion {
    boolean jacuzzi;

    public Suite(String numero, double precioPorNoche, boolean jacuzzi) {
        super(numero, precioPorNoche);
        this.jacuzzi = jacuzzi;
    }

    @Override
    public String mostrarInfo() {
        String jacuzziInfo;
        if (jacuzzi) {
            jacuzziInfo = "Tiene jacuzzi";
        } else {
            jacuzziInfo = "No tiene jacuzzi";
        }
        return super.mostrarInfo() + ", " + jacuzziInfo;
    }
}
