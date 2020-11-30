/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.threads;

import com.example.dominio.Carrito;
import com.example.dominio.Item;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author MARTIN
 */
public class Consumidor extends Thread {

    private Carrito oCarrito;
    private JTextArea jta;
    private JButton jb;
    private JProgressBar jpb;

    public Consumidor(Carrito oCarrito, JTextArea jta, JButton jb, JProgressBar jpb) {
        this.oCarrito = oCarrito;
        this.jta = jta;
        this.jb = jb;
        this.jpb = jpb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(new Random().nextInt(10) * 1000);
                //simulo tiempo de producir el item
            } catch (InterruptedException e) {
            }

            Item item = oCarrito.sacarItem();
            jta.append("\nConsumidor toma: " + item);
            synchronized (jpb) {
                jpb.setValue(oCarrito.getPorcentajeOcupado());
            }
        }
        jb.setEnabled(true);
        jta.append("\nSimulación terminada!");
    }
}
