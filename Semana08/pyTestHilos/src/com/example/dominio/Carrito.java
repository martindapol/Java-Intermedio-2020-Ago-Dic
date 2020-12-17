/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class Carrito {

    private List<Item> carro;
    private static final int CAPACIDAD_MAX = 5;
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public Carrito() {
        carro = new ArrayList<>();
    }

    public boolean ponerItem(Item item) {
        boolean b = false;
        if (carro.size() < CAPACIDAD_MAX) { // mientras el carro está lleno, espera...
            //agregar item
            rwl.writeLock().lock();
            carro.add(item);
            //notificar al resto
            rwl.writeLock().unlock();
            b = true;
        }
        return b;
    }

    public Item sacarItem() {
        Item item = null;
        if (!carro.isEmpty()) {
            rwl.writeLock().lock();
            //sacar ítem del carro
            item = carro.remove(0);
            //notificar al resto
            rwl.writeLock().unlock();
        }
        return item;
    }

    public int getPorcentajeOcupado() {
        return (carro.size() * 100) / CAPACIDAD_MAX;
    }

}
