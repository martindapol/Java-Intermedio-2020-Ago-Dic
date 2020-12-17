/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.hilos.Postman;
import com.example.hilos.Receiver;
import java.util.concurrent.Exchanger;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exchanger<String> channel = new Exchanger<>();
        Postman p = new Postman(channel);
        Receiver r = new Receiver(channel);
        
        p.start();
        r.start();
    }
    
}
