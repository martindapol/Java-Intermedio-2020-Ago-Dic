/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.threads.CTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        //Future<String> result = es.submit(new CTask());
        Collection<Callable<String>> callables = new ArrayList<>();
        callables.add(new CTask(1));
        callables.add(new CTask(2));
        callables.add(new CTask(3));
        callables.add(new CTask(4));
        Collection<Future<String>> promesas =   es.invokeAll(callables);
        
        for (Future<String> promesa : promesas) {
            System.out.println("Terminada?" + promesa.isDone());
            System.out.println("Result: " + promesa.get());
        }
        
        es.shutdown();
    }
    
}
