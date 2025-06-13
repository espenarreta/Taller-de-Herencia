/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author utpl
 */
public class Main {

    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[3];
        
        cuentas[0] = new CuentaAhorro("00000001", 1300, 0.05);
        cuentas[1] = new CuentaCorriente("00000011", 800, 1000.0);
        cuentas[2] = new CuentaInversion("00000111", 4500, 0.08);

        System.out.println("--------Sistema Bancario--------");

        for(int i = 0; i < cuentas.length; i++) {
            Cuenta cuentaActual = cuentas[i];
            System.out.println(cuentaActual.mostrarInfo());
            System.out.println("----------------------------------");
        }
    }
}