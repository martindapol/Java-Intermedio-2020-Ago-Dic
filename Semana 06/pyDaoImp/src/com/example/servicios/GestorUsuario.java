/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dao.DaoFactory;
import com.example.dao.UsuarioDao;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;


/**
 *
 * @author MARTIN
 */
public class GestorUsuario {

    UsuarioDao dao;

    public GestorUsuario() {
        this.dao = DaoFactory.getUsuarioDao();
    }

    public Usuario validarUsuario(String n, String p) {
        try {
            return dao.validate(n, p);
        } catch (DaoExcepcion ex) {
            throw new RuntimeException(ex);
        }
    }
}
