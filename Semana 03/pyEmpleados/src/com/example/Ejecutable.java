/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Consultor;
import com.example.dominio.Empleado;
import com.example.dominio.Empresa;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear empleado y mostrar sus datos:
        Empleado emp = new Consultor(200, 100, 1, "Juan", Calendar.getInstance().getTime(), "Gerente");
        System.out.println(emp);
        
        //Crear empresa y asociar con empleado:
        Empresa empresa = new Empresa("11-1111111-1", "ACME Soft");
        empresa.agregarEmpleado(emp);
        
        //Mostrar nomina y presupuesto Mensual:
        System.out.println(empresa.mostrarNomina());
        System.out.println("\nPRESUPUESTO MENSUAL: $" + empresa.presupuestoMensual());
    }    
}
