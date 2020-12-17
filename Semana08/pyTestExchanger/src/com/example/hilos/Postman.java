/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hilos;

import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class Postman extends Thread{
    private Exchanger<String> channel;

    public Postman(Exchanger<String> channel ) {
        this.channel = channel;
    }

    @Override
    public void run() {
        String [] messages = {"Message1", "Message2", "end"};//consumir un servicio que escuche un red social...
        
        for (String message : messages) {
            try {
                channel.exchange(message);
            } catch (InterruptedException ex) {
                System.err.println("Error al enviar el mensaje!");
            }
        }
        
        
    }
    
    
    
    
    
}
