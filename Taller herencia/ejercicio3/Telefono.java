/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author USUARIO
 */
public class Telefono extends Producto {

    private int numeroSIM;

    public Telefono(String nombre, double precio, int numeroSIM) {
        super(nombre, precio);
        this.numeroSIM = numeroSIM;
    }

    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Numero de SIM: " + numeroSIM);
    }
}
