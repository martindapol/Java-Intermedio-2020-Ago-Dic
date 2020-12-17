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
public class Receiver extends Thread {

    private Exchanger<String> channel;

    public Receiver(Exchanger<String> channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        String msg="";
        
        do {            
            try {
                msg = channel.exchange(msg);
                System.out.println("Message: " + msg);
            } catch (InterruptedException ex) {
                System.err.println("Error al recibir el mensaje!");
            }
        } while (!msg.equalsIgnoreCase("end"));
    }
}
