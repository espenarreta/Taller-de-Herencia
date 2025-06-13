/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Televisor("Samsung QLED", 800.0, 55);
        productos[1] = new Telefono("iPhone 14", 999.0, 2);
        productos[2] = new Laptop("Dell XPS", 1200.0, 16);

        double total = 0.0;
        System.out.println("=== FACTURA ===");
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarDetalle();
            System.out.println("--------------------");
            total += productos[i].calcularPrecioConIVA();
        }
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
}
