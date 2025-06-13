/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author utpl
 */
public class CuentaInversion extends Cuenta {
    double rendimientoI;

    public CuentaInversion(String numero, double saldo, double rendimiento) {
        super(numero, saldo);
        this.rendimientoI = rendimiento;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Rendimiento: " + (rendimientoI * 100) + "%";
    }
}
