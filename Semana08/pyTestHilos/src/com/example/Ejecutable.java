/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Carrito;
import com.example.gui.JFHilosConcurrentes;
import com.example.threads.Consumidor;
import com.example.threads.EjemploRunnable;
import com.example.threads.Productor;
import com.example.threads.ThreadEjemplo;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFHilosConcurrentes win = new JFHilosConcurrentes("Simulación PRODUCTOR/CONSUMIDOR");
        win.setVisible(true);
    }
    
}
