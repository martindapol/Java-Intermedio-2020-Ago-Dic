/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;

import ejemplos.collections.comparations.ComparadorVehiculosPorPatente;
import ejemplos.collections.utils.Timer;
import ejemplos.generics.vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author george
 */
public class ListasTest {

    /**
     * Método de pruebas, compara cuanto demora la inserción en un ArrayList y
     * en un LinkedList
     * @param cantidadElementos 
     */
    public void insercionArrayVsLinked(int cantidadElementos) {

        List<Integer> arrayList = new ArrayList<>(cantidadElementos);
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("\n\n>>> Prueba de inserción ArrayList vs Linked List <<<<\n");
        System.out.println("Probando con : " + cantidadElementos + " elementos");

        System.out.println("\n>>> Insertando elementos al final de la lista...");
        insert(arrayList, cantidadElementos, true,  ">>> <ArrayList  > Inserción al final");
        insert(linkedList, cantidadElementos, true, ">>> <LinnkedList> Inserción al final");

        System.out.println("\nInsertando elementos al inicio de la lista...");
        insert(arrayList, cantidadElementos, false, ">>> <ArrayList  > Inserción al inicio");
        insert(linkedList, cantidadElementos, false,">>> <LinnkedList> Inserción al inicio");
    }

     /**
     * Método de pruebas, compara cuanto demora el ordenamiento en un ArrayList y
     * en un LinkedList
     * @param cantidadElementos 
     */
    public void ordenamientoArrayVsLinked(int cantidadElementos) {
        Timer tArray, tLinked;
        List<Integer> arrayList = new ArrayList<>(cantidadElementos);
        List<Integer> linkedList = new LinkedList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();

        System.out.println("\n\n>>> Prueba de ordenamiento ArrayList vs Linked List <<<<\n");
        System.out.println(">>> Probando con : " + cantidadElementos + " elementos");
        System.out.println("\n>>> Generando números aleatorios...");
        for (int i = 0; i < cantidadElementos; i++) {
            arrayList.add(random.nextInt());
        }
        linkedList.addAll(arrayList);

        tArray = new Timer(">>> <ArrayList > Ordenamiento");
        Collections.sort(arrayList);
        System.out.println(tArray.end());

        tLinked = new Timer(">>> <LinkedList> Ordenamiento");
        Collections.sort(linkedList);
        System.out.println(tLinked.end());

    }

    /**
     * Inserta cantidadElementos en una lista e informa cuánto demoró la
     * operación
     *
     * @param list La lista donde se insertan los elementos
     * @param cantidadElementos La cantidad de elementos a insertar
     * @param alFinal Si los elementos se insertan al final de la lista, o al
     * inicio
     * @param descripcion La descripción de la operación, para mostrarla con el
     * timer
     */
    private void insert(List<Integer> list, int cantidadElementos, boolean alFinal, String descripcion) {
        Timer timer = new Timer(descripcion, false);
        for (int i = 0; i < cantidadElementos; i++) {
            if (alFinal) {
                list.add(i);
            } else {
                list.add(0, i);
            }
        }
        System.out.println(timer.end());
    }

    /**
     * Ordena una lista de vehículos
     *
     * @param vehiculos Los vehículos a ordenar
     */
    public void ordenamiento(Vehiculo[] vehiculos) {
        List<Vehiculo> listado = Arrays.asList(vehiculos);

        System.out.println("Sin ordenar...");
        for (Vehiculo v : listado) {
            System.out.println(v);
        }

        Collections.sort(listado, new ComparadorVehiculosPorPatente());

        System.out.println("Ordenando...");
        for (Vehiculo v : listado) {
            System.out.println(v);
        }

    }


}
