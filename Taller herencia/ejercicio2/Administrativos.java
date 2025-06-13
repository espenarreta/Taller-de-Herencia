/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author utpl
 */
public class Administrativos extends ComunidadUniversitaria {

    public Administrativos(String Departamento, String nombre, int ID, String Correo) {
        super(nombre, ID, Correo);
        this.Departamento = Departamento;
    }
    public String Departamento; 
    
    public void mostrarInofrmacion3(){
    super.mostrarInformacion3();
        System.out.println("EL departamento al que pertenece el administrativo es: " + Departamento);
    
    }
}
