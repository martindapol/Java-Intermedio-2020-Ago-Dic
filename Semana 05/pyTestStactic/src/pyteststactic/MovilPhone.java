/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

import java.io.Serializable;

/**
 *
 * @author MARTIN
 */
public class MovilPhone implements Mostrable, Serializable,Comparable<MovilPhone>{

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(MovilPhone t) {
        return 1;
    }
}
