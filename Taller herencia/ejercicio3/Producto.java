/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author USUARIO
 */
class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularPrecioConIVA() {
        return precio * 1.12; // IVA del 12%
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + getNombre());
        System.out.println("Precio base: $" + getPrecio());
        System.out.println("Precio con IVA: $" + calcularPrecioConIVA());
    }
}
