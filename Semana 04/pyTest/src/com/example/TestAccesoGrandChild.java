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
public class TestAccesoGrandChild extends TestAccesoChild{

    public TestAccesoGrandChild() {
        super(0);
        super.key = 1;
        otra = "Tambien lo cambio!";
    }
    
}
