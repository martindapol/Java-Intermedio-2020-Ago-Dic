/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

/**
 *
 * @author MARTIN
 */
public class DaoFactory {
    public static CorreoDAO getCorreoDao(){
        return new CorreoDAOMemory();
    }
}
