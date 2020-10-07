/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.generics.vehiculos;

/**
 *
 * @author george
 */
public abstract class Vehiculo implements Comparable<Vehiculo>{

    private final int modelo;
    private final String descripcion;
    private final String patente;

    public Vehiculo(int modelo, String descripcion, String patente) {
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPatente() {
        return patente;
    }

    public int getModelo() {
        return modelo;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return ((Integer)this.modelo).compareTo(o.modelo);
    }
    
    

    @Override
    public String toString() {
        return "(Modelo:" + getModelo() + " - Descripción: " + getDescripcion() + " - Patente: " + getPatente() + ")";
    }

}
