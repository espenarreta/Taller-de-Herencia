/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author utpl
 */
public class Ejercicio2 {

    public static void main(String[] args) {
     
 Estudiantes estu = new Estudiantes("Computacion", 8.75, "Kenny", 1150024204, "Jkparedes43outlook.com"); 
 Docentes doce = new Docentes("Programacion", "Leonardo", 115005518, "Leonarod2345@utpl.edu.ec" );
 Administrativos ad = new Administrativos("Servicio tecnico", "Eduardo", 1152018842, "Edupela@utpl.edu.ec"); 
 
 estu.mostrarInformacion2();
 doce.mostrarInformacion1();
 ad.mostrarInofrmacion3();
    }
}
