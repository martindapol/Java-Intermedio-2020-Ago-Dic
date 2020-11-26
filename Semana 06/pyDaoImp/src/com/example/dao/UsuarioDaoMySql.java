/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class UsuarioDaoMySql implements UsuarioDao {

    @Override
    public void create(Usuario u) throws DaoExcepcion {
        String query = "INSERT INTO Usuario (id_usuario, n_usuario, password, ult_acceso)"
                + " VALUES(?,?,?,?) ";

        try (Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC", "111mil", "111mil");
                PreparedStatement stmt = cnn.prepareStatement(query)) {
            stmt.setInt(1, u.getId());
            stmt.setString(2, u.getNombre());
            stmt.setString(3, u.getClave());
            stmt.setDate(4, new Date(u.getUltimoAcceso().getTime()));

            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        }

    }

    @Override
    public Usuario validate(String n, String p) throws DaoExcepcion {
        Usuario oUsuario = null;
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
}
