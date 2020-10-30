/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;

/**
 *
 * @author MARTIN
 */
public interface UsuarioDao {
    void create(Usuario u)throws DaoExcepcion;
    Usuario validate(String n, String p) throws DaoExcepcion;
}
