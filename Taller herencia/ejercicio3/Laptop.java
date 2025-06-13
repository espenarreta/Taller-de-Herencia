/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author USUARIO
 */
public class Laptop extends Producto {

    private int memoriaRAM;

    public Laptop(String nombre, double precio, int memoriaRAM) {
        super(nombre, precio);
        this.memoriaRAM = memoriaRAM;
    }

    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
    }
}
