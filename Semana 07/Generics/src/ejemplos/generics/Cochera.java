/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.generics;

import ejemplos.generics.vehiculos.Vehiculo;

/**
 *
 * @author george
 * @param <T>
 */
public class Cochera<T> {

    private final String nombre;
    private T vehiculo = null;

    public Cochera(String nombre) {
        this.nombre = nombre;
    }

    public boolean ingresar(T v) {
        boolean resultado = true;

        if (estaOcupada()) {
            // Si la cochera ya estaba ocupada, no puedo ingresar
            // otro vehículo
            resultado = false;
        } else {
            this.vehiculo = v;
        }
        return resultado;
    }

    public boolean estaOcupada() {
        return this.vehiculo != null;
    }

    public boolean liberar() {
        boolean resultado = true;
        if (estaOcupada()) {
            this.vehiculo = null;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public T getOcupante(){
        return this.vehiculo;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String s = "[Cochera:  " + getNombre() + "| Estado: ";
        if (estaOcupada()) {
            s = s + "OCUPADA | " + vehiculo;
        } else {
            s = s + "LIBRE";
        }
        return s + "]";
    }

}
