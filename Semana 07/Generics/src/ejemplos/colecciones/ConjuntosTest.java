/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;

import ejemplos.collections.comparations.ComparadorVehiculosPorDescripcion;
import ejemplos.collections.comparations.ComparadorVehiculosPorPatente;
import ejemplos.generics.vehiculos.Vehiculo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author george
 */
public class ConjuntosTest {

    /**
     * Realiza una prueba generando un HashSet y tres TreeSet con distintos comparators
     * 
     * @param vehiculos 
     */
    public void probarSet(List<Vehiculo> vehiculos) {
        Set<Vehiculo> hashSet = new HashSet<>(vehiculos);
        Set<Vehiculo> treeSetComparable = new TreeSet<>(vehiculos);
        Set<Vehiculo> treeSetPatente = new TreeSet<>(new ComparadorVehiculosPorPatente());
        treeSetPatente.addAll(vehiculos);
        Set<Vehiculo> treeSetDescripcion = new TreeSet<>(new ComparadorVehiculosPorDescripcion());
        treeSetDescripcion.addAll(vehiculos);
        

        System.out.println("\n\n>>> Prueba conjuntos HashSet vs TreeSet <<<<\n");

        System.out.println("\n>>> Los elementos Ingresados en el HashSet se ven así: ");
        mostrarSet(hashSet);
        System.out.println("\n>>> Los elementos Ingresados en el TreeSet (Ordenados por ser comparable) se ven así: ");
        mostrarSet(treeSetComparable);
        System.out.println("\n>>> Los elementos Ingresados en el TreeSet (Ordenados por patente) se ven así: ");
        mostrarSet(treeSetPatente);
        System.out.println("\n>>> Los elementos Ingresados en el TreeSet (Ordenados por descripción) se ven así: ");
        mostrarSet(treeSetDescripcion);
        
    }
    
    private void mostrarSet(Set<Vehiculo> set){
        for(Vehiculo v : set){
            System.out.println(">>> " + v );
        }
    }

  
}
