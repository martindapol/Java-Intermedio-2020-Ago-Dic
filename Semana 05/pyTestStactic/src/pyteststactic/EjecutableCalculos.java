/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

import static java.lang.Math.*;

/**
 *
 * @author MARTIN
 */
public class EjecutableCalculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cos = 3;
        double angulo = 30;
        
       //sen2x +  cos2x = 1
       
       double rtdo = pow(cos(angulo), 2) + pow(sin(angulo), 2); 
       
        System.out.println(rtdo);        
    
       
        
        
    }
    
}
