/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author USUARIO
 */
public class Televisor extends Producto {

    private int pulgadas;

    public Televisor(String nombre, double precio, int pulgadas) {
        super(nombre, precio);
        this.pulgadas = pulgadas;
    }

    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Tamaño: " + pulgadas + " pulgadas");
    }
}
