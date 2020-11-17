/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.dominio.Usuario;
import com.example.excepciones.CorreoInvalidoException;
import com.example.excepciones.DaoExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class UsuarioDaoMySql implements UsuarioDao {

    @Override
    public void create(Usuario u) throws DaoExcepcion {
        //TODO: completar con INSERT INTO
    }

    @Override
    public Usuario validate(String n, String p) throws DaoExcepcion {
        Usuario oUsuario = null;
        //JDBC: Java Data Base Connectivity-->manera standar de acceder a una BD
        //con JAVA
        
        
        String query = "SELECT *"
                + " FROM usuarios "
                + " WHERE n_usuario=? "
                + " AND password=? ";

        try (Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC", "111mil", "111mil");
                PreparedStatement stmt = cnn.prepareStatement(query)) {
            stmt.setString(1, n);
            stmt.setString(2, p);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                oUsuario = new Usuario(rs.getString("n_usuario"), rs.getString("password"), rs.getDate("ult_acceso"), rs.getInt("id_usuario"));
            }
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        }

        return oUsuario;
    }

    @Override
    public List<Correo> inBox(int id) throws DaoExcepcion {
        List<Correo> lst = null;
        String query = "SELECT *"
                + " FROM correos"
                + " WHERE id_usuario = ?";

        try (Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC&useSS=false", "111mil", "111mil");
                PreparedStatement stmt = cnn.prepareStatement(query)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery(query);
            Correo oCorreo = null;
            while (rs.next()) {
                oCorreo = new Correo(rs.getString(2), rs.getString(3), rs.getDate(6), rs.getString(4));
                lst.add(oCorreo);
            }
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        } catch (CorreoInvalidoException ex) {
            throw new DaoExcepcion("Correo incorrecto!", ex);
        }

        return lst;
    }
}
