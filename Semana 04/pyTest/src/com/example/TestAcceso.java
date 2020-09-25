/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author MARTIN
 */
public class TestAcceso extends Object {

    int valor;
    protected int key;
    static public String otra;

    public TestAcceso(int valor) {
        this.valor = valor;
    }

    public String keyValue() {
        return "Key: " + key + "| Value: " + valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof TestAcceso)) {
            return false;
        }

        TestAcceso x = (TestAcceso) o;
        return this.valor == x.valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.valor;
        return hash;
    }
}
