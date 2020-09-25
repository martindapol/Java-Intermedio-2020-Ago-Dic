/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.other;

import com.example.TestAcceso;
import com.example.TestAccesoGrandChild;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestAcceso test= new TestAcceso(6);
        TestAccesoGrandChild.otra = "Lo que quiera!";
       
    }
    
}
