/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyexecuteservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import pyexecuteservice.hilos.CTask;

/**
 *
 * @author MARTIN
 */
public class PyExecuteService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ExecutorService  ejecutor = Executors.newFixedThreadPool(6);
        Future<String> result = ejecutor.submit(new CTask());
        
        while(!result.isDone())
            System.out.println("waiting");
        
        System.out.println("Result: " + result.get());
        //ejecutor.shutdown();
        
    }
    
}
