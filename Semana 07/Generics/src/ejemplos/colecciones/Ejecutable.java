/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.colecciones;

import ejemplos.generics.vehiculos.Automovil;
import ejemplos.generics.vehiculos.Motocicleta;
import ejemplos.generics.vehiculos.Vehiculo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author george
 */
public class Ejecutable {

    public static void main(String[] args) {
        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== Banco de Pruebas de Colecciones =====");
            System.out.println("1) Probar Listas");
            System.out.println("2) Probar Sets");
            System.out.println("3) Probar Colas");
            System.out.println("4) Probar Pilas");
            System.out.println("5) Probar Mapas");
            System.out.println("0) Salir");

            try {
                System.out.print("Ingrese opción: ");
                opcion = sc.nextInt();
            } catch (NumberFormatException nfe) {
                System.err.println("Opción incorrecta...");
                continue;
            }

            switch (opcion) {
                case 1:
                    probarListas();
                    break;
                case 2:
                    probarSets();
                    break;
                case 3:
                    probarColas();
                    break;
                case 4:
                    probarPilas();
                    break;
                case 5:
                    probarMapas();
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.err.println("Opción incorrecta...");
            }
        } while (opcion != 0);

    }

    private static void probarListas() {
        int cantidadElementos;
        ListasTest listas = new ListasTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>> Prueba de listas...");
        System.out.println(">>> Se realizarán las siguientes pruebas:");
        System.out.println(">>>\t1.a) Inserción de elementos al final de la lista comparando ArrayList vs LinkedList");
        System.out.println(">>>\t1.b) Inserción de elementos al inicio de la lista comparando ArrayList vs LinkedList");
        System.out.println(">>>\t2) Inserción de elementos aleatorios y ordenamiento comparando ArrayList vs LinkedList");

        try {
            System.out.print("Ingrese la cantidad de elementos de la prueba: ");
            cantidadElementos = sc.nextInt();
            listas.insercionArrayVsLinked(cantidadElementos);
            listas.ordenamientoArrayVsLinked(cantidadElementos);
        } catch (NumberFormatException nfe) {
            System.err.println("Opción incorrecta...");
            
        }
    }

    private static void probarSets() {
        ConjuntosTest conjuntos = new ConjuntosTest();
        conjuntos.probarSet(Arrays.asList(getVehiculos()));
    }

    private static void probarColas() {
        ColasTest colas = new ColasTest();
        colas.test(Arrays.asList(getVehiculos()));
    }

    private static void probarPilas() {
        PilasTest pilas = new PilasTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>> Prueba de Pilas...");
        System.out.print("Ingrese la frase que quiere espejar: ");
        pilas.test(sc.nextLine());
    }

    private static void probarMapas(){
        MapasTest mapas = new MapasTest();
        mapas.test(Arrays.asList(getVehiculos()));
    }
    /**
     * Devuelve un array con vehículos para las pruebas. Desde luego que no es
     * la manera de obtener datos, pero hasta que veamos como podemos traerlos
     * de un archivo u otro medio, nos resulta de utilidad.
     *
     * @return Array con vehículos
     */
    public static Vehiculo[] getVehiculos() {
        return new Vehiculo[]{
            new Automovil(1994, "VW Gol", "RDE 123"),
            new Automovil(2000, "Hyundai Accent", "KDE 123"),
            new Automovil(2015, "Renault Fluence", "ZFE 123"),  
            new Automovil(2015, "Renault Fluence", "ZFE 123"), // Notar la repetición
            new Automovil(2015, "Renault Sandero", "FGA 487"),
            new Motocicleta(2010, "Moto 1", "ZFE 123"),
            new Motocicleta(2011, "Yamaha", "RRX 379"),
        };
    }
}
