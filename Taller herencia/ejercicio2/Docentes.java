/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author utpl
 */
public class Docentes extends ComunidadUniversitaria {

    public String Materias;

    public Docentes(String Materias, String nombre, int ID, String Correo) {
        super(nombre, ID, Correo);
        this.Materias = Materias;
    }
   public void mostrarInformacion1(){
   super.mostrarInformacion1();
       System.out.println("La materia que imparte el docente es" + Materias);
   
   }

}
