/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author MARTIN
 */
public class Empresa {

    private String cuit;
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList(30);
    }

    public void agregarEmpleado(Empleado e) {
        if (e != null) {
            empleados.add(e);
        }
    }

    public String mostrarNomina() {
        StringBuilder sb = new StringBuilder("Nomina de empleados\n");

        for (Empleado e : empleados) {
            sb.append(e.toShortString());
        }
        sb.append("Total de empleados: ");
        sb.append(empleados.size());
        return sb.toString();
    }

    public float presupuestoMensual() {
        float aux = 0;
        for (int i = 0; i < empleados.size(); i++) {
            aux += empleados.get(i).calcularSueldo();
        }
        return aux;
    }

    public void incrementarSueldo(float porcentaje) {
        for (Empleado e : empleados) {

            //if(e.getClass().getName().equals("TrabajadorFijo"))
            if (e instanceof TrabajadorFijo)//
            {
                TrabajadorFijo t = (TrabajadorFijo) e;
                float nuevo = t.getSueldo() + (t.getSueldo()*porcentaje)/100; 
                t.setSueldo(nuevo);
            }
        }
    }

}
