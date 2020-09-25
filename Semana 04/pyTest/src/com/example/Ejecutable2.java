/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class Ejecutable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Object> lst = new ArrayList<>(3); 
       
      
        for (Object object : lst) {
            System.out.println(object.toString());
        }
        
        System.out.println("Total: " + lst.size());
                
       
      
    }
    
}
