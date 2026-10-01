/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author abrah
 */
public class PerroGrande extends Perro{
    
    private int peso;

    public PerroGrande(int peso, int edad, String raza, String nombre) {
        super(edad, raza, nombre);
        this.peso = peso;
    }

    public PerroGrande(int peso, String nombre) {
        super(nombre);
        this.peso = peso;
    }

    public PerroGrande(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }
    
    
    

    @Override
    public void hacerSonido() {
       System.out.println(super.getNombre()+ " hace Guau guau!");
    }

 

    

   

   
    
    
    
}
