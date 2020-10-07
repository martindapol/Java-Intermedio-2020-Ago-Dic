/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.collections.utils;

/**
 *
 * @author george
 */
public class Timer {

    private long startTime = -1, endTime = -1;
    private final String operacion;
    boolean timeInNanos = false;

    public Timer(String operacion, boolean inNanos) {
        this.timeInNanos = inNanos;
        this.operacion = operacion;
        start();
    }

    public Timer(String operacion) {
        this(operacion, false);
    }

    public final void start() {
        startTime = System.nanoTime();
    }

    public final Timer end() {
        endTime = System.nanoTime();
        return this;
    }

    @Override
    public String toString() {

        return String.format(
                "%s demoró: %8d %ssegundos", 
                operacion, 
                ((endTime - startTime) / ((timeInNanos) ? 1L : 1_000_000L)), 
                ((timeInNanos) ? "nano" : "mili")
        );

    }

}
