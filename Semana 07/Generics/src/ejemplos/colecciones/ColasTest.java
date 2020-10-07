/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;


import ejemplos.collections.comparations.ComparadorVehiculosPorPatente;
import ejemplos.generics.vehiculos.Vehiculo;
import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author george
 */
public class ColasTest {

    public void test(List<Vehiculo> vehiculos){
         System.out.println("\n\n>>> Prueba colas Cola vs. Cola de Prioridad <<<<\n");
         // Cola regular FIFO 
         Queue<Vehiculo> cola = new ArrayDeque<>(); 
         // Cola con prioridad, que utiliza el hecho de que Vehículo es Comparable
         Queue<Vehiculo> priorityModelo  = new PriorityQueue<>();   
         // Cola con prioridad que utiliza este Comparator para la prioridad
         Queue<Vehiculo> priorityPatente = new PriorityQueue<>(new ComparadorVehiculosPorPatente());    
         
         // Aquí se espera que paguen en el orden que ingresaron a la cola
         System.out.println("\n>>> La atención del peaje en una Cola simple se ve así: \n");
         testQueue(vehiculos, cola);
         // Aquí se espera que paguen ordenados por modelo
         System.out.println("\n>>> La atención del peaje en una Cola con prioridad por Modelo (por ser Comparable) se ve así: \n");
         testQueue(vehiculos, priorityModelo);
         // Aquí se espera que paguen ordenados por Patente
         System.out.println("\n>>> La atención del peaje en una Cola con prioridad por Patente (por el Comparator) se ve así: \n");
         testQueue(vehiculos, priorityPatente);
    }
    
    private void testQueue(List<Vehiculo> vehiculos, Queue<Vehiculo> q){
        for(Vehiculo v: vehiculos){
            System.out.println(">>> A la cola: " + v);
            q.add(v);
        }
        
        System.out.println("\n>>> Siendo atendidos en el peaje...");
        while(!q.isEmpty()){
            System.out.println(">>>\t\tPagando: " + q.remove());
        }
    }

}
