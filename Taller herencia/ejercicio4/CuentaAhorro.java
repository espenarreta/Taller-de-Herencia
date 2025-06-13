/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author utpl
 */
public class CuentaAhorro extends Cuenta {
    double tasaI;

    public CuentaAhorro(String numero, double saldo, double tasaInteres) {
        super(numero, saldo);
        this.tasaI = tasaInteres;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Interés: " + (tasaI * 100) + "%";
    }
}
