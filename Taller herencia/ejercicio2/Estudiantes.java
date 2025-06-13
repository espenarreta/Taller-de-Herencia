/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author utpl
 */
public class Estudiantes extends ComunidadUniversitaria {

    public String carrera;
    public double Promedio;

    public Estudiantes(String carrera, double Promedio, String nombre, int ID, String Correo) {
        super(nombre, ID, Correo);
        this.carrera = carrera;
        this.Promedio = Promedio;
    }

    
        public void mostrarInformacion2(){
        super.mostrarInformacion2();
            System.out.println("La carrera del estudiante es: " + carrera);
            System.out.println("El promedio del estudiante es: " + Promedio);

    }
}
