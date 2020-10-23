/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.excepciones;

/**
 *
 * @author MARTIN
 */
public class CorreoInvalidoException extends Exception{
    public CorreoInvalidoException(String remitente) {
        super("Parametro incorrecto <" + remitente + "> no es válido!");
    }    
}
