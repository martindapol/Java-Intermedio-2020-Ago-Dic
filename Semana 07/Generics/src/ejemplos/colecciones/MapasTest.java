/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;

import ejemplos.collections.utils.Timer;
import ejemplos.generics.vehiculos.Vehiculo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author george
 */
public class MapasTest {

    public void test(List<Vehiculo> vehiculos) {
        Timer t;
        Scanner sc = new Scanner(System.in);
        String patenteABuscar;
        Map<String, Vehiculo> map = new HashMap<>();

        // Se ingresan los vehículos al mapa, utilizando la patente como clave
        for (Vehiculo v : vehiculos) {
            map.put(
                    v.getPatente(), // Utilizo, en este caso, la patente como clave
                    v // El valor es el vehículo
            );
        }

        System.out.println("\n\n>>> Prueba de Mapas (Búsqueda por patente) <<<<\n");
        
        System.out.print("\nIngrese la patente a buscar (enter corta): ");
        patenteABuscar = sc.nextLine();
        while (!patenteABuscar.equals("")) {
            // Se busca en el mapa la patente
            t = new Timer("Búsqueda en mapa", true);
            Vehiculo v = map.get(patenteABuscar); // Se buscar por la clave
            System.out.println(">>> " + t.end());
            if (v != null) {
                System.out.println(">>> Vehículo encontrado: " + v);
            } else {
                System.err.println(">>> Vehículo no encontrado!");
            }
            
            System.out.print("\nIngrese otra patente a buscar (enter corta): ");
            patenteABuscar = sc.nextLine();
        }
    }

}
