/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author utpl
 */
public class ComunidadUniversitaria {

    public String nombre;
    public int ID;
    public String Correo;

    public ComunidadUniversitaria(String nombre, int ID, String Correo) {
        this.nombre = nombre;
        this.ID = ID;
        this.Correo = Correo;
    }

    public void mostrarInformacion1() {
        System.out.println("-----------------------------");
        System.out.println("El nombre del dodente es: " + nombre);
        System.out.println("La identificacion del docente es: " + ID);
        System.out.println("El correo del docete es: " + Correo);

    }

    public void mostrarInformacion2() {
        
        System.out.println("-----------------------------");
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La identificacion del estudiante es: " + ID);
        System.out.println("El correo del estudiante es: " + Correo);

    }

    public void mostrarInformacion3() {
        
        System.out.println("-----------------------------");
        System.out.println("El nombre del administrativo es: " + nombre);
        System.out.println("La identificacion del administrativo es: " + ID);
        System.out.println("El correo del administrativo es: " + Correo);
     

    }
}
