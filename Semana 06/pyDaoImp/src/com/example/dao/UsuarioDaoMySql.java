/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MARTIN
 */
public class UsuarioDaoMySql implements UsuarioDao{

    @Override
    public void create(Usuario u) throws DaoExcepcion {
        //TODO: completar con INSERT INTO
    }

    @Override
    public Usuario validate(String n, String p) throws DaoExcepcion {
        Usuario oUsuario = null;
        //JDBC: Java Data Base Connectivity-->manera standar de acceder a una BD
        //con JAVA
        try ( Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC&useSS=false", "111mil", "111mil");
                Statement stmt = cnn.createStatement() ){
                String query = "SELECT * " +
                    "FROM usuarios " +
                    "WHERE n_usuario = '" + n + "' " + 
                    "AND password = '" + p + "' ";
                
                ResultSet rs =  stmt.executeQuery(query);
                if(rs.next()){
                    oUsuario = new Usuario(rs.getString("n_usuario"), rs.getString("password"), rs.getDate("ult_acceso"));
                }
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        }
        
        return oUsuario;
    }
}
