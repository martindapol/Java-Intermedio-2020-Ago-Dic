/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dao.UsuarioDao;
import com.example.dao.UsuarioDaoFileImp;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;
import java.util.Calendar;

/**
 *
 * @author MARTIN
 */
public class ScriptCargaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DaoExcepcion {
        UsuarioDao dao = new UsuarioDaoFileImp();
        dao.create(new Usuario("acme", "magia", Calendar.getInstance().getTime(), 3));
    }
    
}
