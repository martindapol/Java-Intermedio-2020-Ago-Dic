/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class Singleton {
    
    private static final Singleton instancia = new Singleton();
    private List<String> errores;
    
    private Singleton(){
        errores = new ArrayList<>();
    }
    
    public static Singleton getInstancia(){
        return instancia;
    }
    
    public void addError(String error){
        errores.add(error);
    }
 
}
