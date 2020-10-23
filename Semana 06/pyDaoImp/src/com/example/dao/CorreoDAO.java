/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.excepciones.DaoExcepcion;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public interface CorreoDAO {
    void add(Correo correo) throws DaoExcepcion;
    List<Correo> findByAsunto(String criterio) throws DaoExcepcion;
}