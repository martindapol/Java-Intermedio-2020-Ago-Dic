/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

/**
 *
 * @author MARTIN
 */
public class EjecutableSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String error = "NPI";
       String error2 = "magia!!!";
       
       Singleton s = Singleton.getInstancia();
       s.addError(error);
       s.addError(error2);
    }
    
}
