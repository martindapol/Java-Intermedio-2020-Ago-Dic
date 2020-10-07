/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author george
 */
public class PilasTest {

    public void test(String frase) {
        
        Deque<Character> pila = new ArrayDeque<>();

        for (int i = 0; i < frase.length(); i++) {
            Character c = frase.charAt(i);
            pila.push(c);
        }

        System.out.print(">>> Su frase espejada es: ");
        while (!pila.isEmpty()) {
            Character c = pila.pop();
            System.out.print(c);
        }
        
        System.out.println();
    }
}
