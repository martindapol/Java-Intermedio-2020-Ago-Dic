/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.objects;

import ejemplos.collections.comparations.ComparadorVehiculosPorDescripcion;
import ejemplos.collections.comparations.ComparadorVehiculosPorPatente;
import ejemplos.generics.vehiculos.Automovil;

/**
 *
 * @author george
 */
public class EjemploObjects {
    public static void main(String[] args) {
        Automovil a1 = new Automovil(1994, "Ford Fiesta", "ZQR 123");
        Automovil a2 = new Automovil(2000, "VW GOL", "ABC 123");
        
        ComparadorVehiculosPorDescripcion porDesc = new ComparadorVehiculosPorDescripcion();
        ComparadorVehiculosPorPatente porPatente = new ComparadorVehiculosPorPatente();
        
        if(a1.equals(a2)){
            System.out.println("Son iguales!");
        } else {
            System.out.println("NO Son iguales!");
        }
        
       // System.out.println("La comparación por modelo es: " + a1.compareTo(a2));
        System.out.println("La comparación por descripción es: " + porDesc.compare(a1, a2));
        System.out.println("La comparación por patente es: " + porPatente.compare(a1, a2));
        
    }
}
