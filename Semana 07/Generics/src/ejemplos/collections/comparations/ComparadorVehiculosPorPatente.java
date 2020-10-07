/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.collections.comparations;

import ejemplos.generics.vehiculos.Vehiculo;
import java.util.Comparator;

/**
 *
 * @author george
 */
public class ComparadorVehiculosPorPatente 
        implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        String patente1 = o1.getPatente();
        String patente2 = o2.getPatente();
        
        return patente1.compareTo(patente2);
    }
    
    
    
}
