/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author utpl
 */
public class Estandar extends Habitacion {
    boolean vista;

    public Estandar(String numero, double precioPorNoche, boolean vista) {
        super(numero, precioPorNoche);
        this.vista = vista;
    }

    @Override
    public String mostrarInfo() {
        String vistaInfo;
        if (vista) {
            vistaInfo = "Si tiene vista";
        } else {
            vistaInfo = "No tiene vista";
        }
        return super.mostrarInfo() + ", " + vistaInfo;
    }
}
