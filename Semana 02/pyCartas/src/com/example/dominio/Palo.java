/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author MARTIN
 */
public class Palo extends Object{
    private final String nombre;

    public Palo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() { //permite obtener el estado de un objeto como cadena
        return nombre;
    }
}
