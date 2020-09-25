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
public class Consultor extends Empleado{
    private int horas;
    private float valorHora;
    
    public Consultor(int legajo, String nombre, Date fechaCto, String puesto) {
        super(legajo, nombre, fechaCto, puesto);
    }

    public Consultor(int horas, float valorHora, int legajo, String nombre, Date fechaCto, String puesto) {
       this(legajo, nombre, fechaCto, puesto);
       this.horas = horas;
       this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSueldo() {
        return valorHora * horas;
    }

   
    
}
