/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.threads;

/**
 *
 * @author MARTIN
 */
public class ThreadEjemplo extends Thread{
    //atributos propios del hilo
    
    public ThreadEjemplo(String nombre) {
        super(nombre); // this.setName(nombre);
    }
    
    @Override
    public void run() {
        //primer línea...
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + this.getName()  +  "| i:" + i);
        }
        
        System.out.println("Adios hilo: " + this.getName() );
    }//muere el hilo, pero no re-encarna
    
}
