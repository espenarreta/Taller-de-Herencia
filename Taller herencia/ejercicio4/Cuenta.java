/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author utpl
 */
public class Cuenta {
    String numeroCuenta;
    double saldo;

    public Cuenta(String numero, double saldo) {
        this.numeroCuenta = numero;
        this.saldo = saldo;
    }

    public String mostrarInfo() {
        return "Número: " + numeroCuenta + ", Saldo: $" + saldo;
    }
}
