/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author MARTIN
 */
public class TestAccesoChild extends TestAcceso{
    private int key;
    public TestAccesoChild(int valor) {
        super(valor);
        key = 1;
    }
    
    
    @Override
    protected String keyValue(){
        return "Key: " + key  + "| Value: " + valor + "Mas restrictivo!";
    }
    
}
