/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author utpl
 */
public class Ejercicio1 {

    public static void main(String[] args) {
            
        Ave ave = new Ave("volar", "Jessica", "maiz y pepas de girasol", 19); 
        Reptil reptil = new Reptil("reptar", "kenny", "carne de pollo", 20); 
        
        ave.mostrarInformacion();
        reptil.mostrarInformacion();
        
    }
    
}
