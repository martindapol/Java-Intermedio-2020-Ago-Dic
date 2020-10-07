/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.generics;

import ejemplos.generics.vehiculos.Automovil;
import ejemplos.generics.vehiculos.Motocicleta;

/**
 *
 * @author george
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cocheras disponibles
        Cochera<Automovil> cocheraAutos = 
                new Cochera<>("Cochera 1 - Autos");
        
        Cochera<Motocicleta> cocheraMotos = 
                new Cochera<>("Cochera 2 - Motos");
        // Vehículos
        Automovil auto1 = new Automovil(1994, "VW Gol", "RXB-344");
        Automovil auto2 = new Automovil(2005, "Toyota Corolla", "AD-1233-AA");
        Motocicleta moto1 = new Motocicleta(2005, "Zanella", "AA-123");

        // Ingreso 1 auto 
        cocheraAutos.ingresar(auto1);
        System.out.println(cocheraAutos);
        // Ingreso 1 moto
        cocheraMotos.ingresar(moto1);
        System.out.println(cocheraMotos);
        // Se retira el auto
        cocheraAutos.liberar();
        System.out.println(cocheraAutos);

        

    }
}
