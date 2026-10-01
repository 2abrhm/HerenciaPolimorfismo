/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author abrah
 */
public class Pez extends Animal {
    
    double profundidad = 0.0;
    
    
    public Pez(String nombre) {
        super(nombre);
    }

    public void nadar(){
        
    }

    @Override
    public void comer(String comida, int cantidad) {
        super.comer(comida, cantidad); 
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " Glu glu glu!");

    }
   
}
//sonido que hace gluglu