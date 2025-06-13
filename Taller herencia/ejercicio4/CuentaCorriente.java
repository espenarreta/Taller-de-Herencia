/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author utpl
 */
public class CuentaCorriente extends Cuenta {
    double sobregiroP;

    public CuentaCorriente(String numero, double saldo, double sobregiro) {
        super(numero, saldo);
        this.sobregiroP = sobregiro;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Sobregiro: $" + sobregiroP;
    }
}
