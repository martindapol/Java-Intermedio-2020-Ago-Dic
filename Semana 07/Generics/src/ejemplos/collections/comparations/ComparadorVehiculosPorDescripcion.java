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
public class ComparadorVehiculosPorDescripcion 
    implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        String descripcion1 = o1.getDescripcion();
        String descripcion2 = o2.getDescripcion();
        
        return descripcion1.compareTo(descripcion2);
    }
    
    
    
    
}
