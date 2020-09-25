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
public class TrabajadorFijo extends Empleado{
    private float sueldo;
    private int horasExtra;

    public TrabajadorFijo(float sueldo, int horasExtra, int legajo, String nombre, Date fechaCto, String puesto) {
        super(legajo, nombre, fechaCto, puesto);
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }    
    
    @Override
    public float calcularSueldo() {
        int extras = horasExtra>20?20: horasExtra;
        return sueldo + 300 * extras;
    }

   
}
