/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class Carrito {
    private List<Item> carro;
    private static final int CAPACIDAD_MAX = 5; 

    public Carrito() {
        carro = new ArrayList<>();
    }
    
    public synchronized void ponerItem(Item item){
        while(carro.size()==CAPACIDAD_MAX){ // mientras el carro está lleno, espera...
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        //agregar item
        carro.add(item);
        //notificar al resto
        notifyAll();
    }
    
    public synchronized Item sacarItem(){
        while(carro.isEmpty()){ //mientras que el carro este vacío, espera...
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        //sacar ítem del carro
        Item item = carro.remove(0); 
        //notificar al resto
        notifyAll();
        return item;
    }
    public int getPorcentajeOcupado(){
        return (carro.size()*100)/CAPACIDAD_MAX;
    }
    
    
}
