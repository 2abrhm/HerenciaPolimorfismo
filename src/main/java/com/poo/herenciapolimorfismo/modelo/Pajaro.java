/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author abrah
 */
public class Pajaro extends Animal{
    
    double altura = 0.0;

    public Pajaro(String nombre) {
        super(nombre);
    }

 
    public void volar(){
        
    }

    @Override
    public void hacerSonido() {
       System.out.println(super.getNombre()+ " Pio pio cuando tiene hambre!");
    }
    
    
    
    }
