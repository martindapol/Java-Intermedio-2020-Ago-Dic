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
public interface CorreoDaoUser extends CorreoDAO{
     
     List<Correo> findByUsuario(int usuario) throws DaoExcepcion;
}
