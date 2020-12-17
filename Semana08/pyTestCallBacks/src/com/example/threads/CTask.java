/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.threads;

import java.util.concurrent.Callable;

/**
 *
 * @author MARTIN
 */
public class CTask implements Callable<String>{
    private final int id;

    public CTask(int id) {
        this.id = id;
    }
    
    
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(5000);
            //simular que estamos consumiendo un servicio remoto!
        } catch (Exception e) {
        }
        
        return "Tarea:" + id + " success!";//
    }
}
