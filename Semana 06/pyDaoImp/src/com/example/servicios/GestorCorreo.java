/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicios;

import com.example.dao.CorreoDAO;
import com.example.dao.CorreoDaoUser;
import com.example.dao.DaoFactory;
import com.example.dominio.Correo;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class GestorCorreo {
    private CorreoDaoUser dao;
    private Usuario user;

    public GestorCorreo(Usuario user) {
        this.dao =  DaoFactory.getCorreoDao();
        this.user = user;
    }
    
    public List<Correo> inBox(){
        List<Correo> aux = null;
        try {
            aux =  dao.findByUsuario(user.getId());
        } catch (DaoExcepcion e) {
            System.out.println("ERROR: " + e.toString());
        }
        return aux;
    }
    
    
    
}
