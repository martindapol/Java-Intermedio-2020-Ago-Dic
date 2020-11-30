/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.threads;

import com.example.dominio.Carrito;
import com.example.dominio.Item;
import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author MARTIN
 */
public class Productor extends Thread {

    private final Carrito oCarrito;
    private final JTextArea jta;
    private final JProgressBar jpb;

    public Productor(Carrito oCarrito, JTextArea jta, JProgressBar jpb) {
        this.oCarrito = oCarrito;
        this.jta = jta;
        this.jpb = jpb;
    }

    @Override
    public void run() {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(new Random().nextInt(10) * 1000);
                //simulo tiempo de producir el item
            } catch (InterruptedException e) {
            }

            int cod = r.nextInt(100);
            Item item = new Item(cod, "Item" + cod);
            jta.append("\nProductor deja: " + item);
            synchronized (jpb) {
                jpb.setValue(oCarrito.getPorcentajeOcupado());
            }
            oCarrito.ponerItem(item);
        }
    }
}
