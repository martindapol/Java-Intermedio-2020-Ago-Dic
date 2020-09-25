/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.Date;

/**
 *
 * @author MARTIN
 */
public abstract class Empleado {
    private final int legajo;
    private String nombre;
    private Date fechaCto;
    private String puesto;
  
    public Empleado(int legajo, String nombre, Date fechaCto, String puesto) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaCto = fechaCto;
        this.puesto = puesto;
    }
    
      public int getLegajo() {
        return legajo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCto() {
        return fechaCto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public abstract float calcularSueldo();

    public String toShortString() {
        return "Empledo: " + nombre + " |Sueldo $: " + this.calcularSueldo() + "\n";
    }
    
    
    @Override
    public String toString() {
        String cadena = "|legajo:" + legajo + "| nombre:" + nombre + "| fechaCto:" + fechaCto + "| puesto:" + puesto + "| Sueldo $: " + this.calcularSueldo(); 
        cadena += " MAGIA!";
        return  cadena ;
    }
}
 