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
public class EjemploRunnable implements Runnable{
    private volatile int i;
   
    
    @Override
    public void run() {
         //primer línea...
        for (i = 0; i < 100; i++) {
           
            System.out.println("Thread: " + Thread.currentThread().getName()  +  "| i:" + i);
        }
        
        System.out.println("Adios hilo: " + Thread.currentThread().getName() );
        
    }
    
}
