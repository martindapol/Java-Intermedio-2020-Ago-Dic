/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.excepciones.CorreoInvalidoException;
import com.example.excepciones.DaoExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class CorreoDAOMySql implements CorreoDaoUser{

    @Override
    public void add(Correo correo) throws DaoExcepcion {
        //TODO: completar con la carga de correo desde la bandeja.
    }

    @Override
    public List<Correo> findByAsunto(String criterio) throws DaoExcepcion {
        List<Correo> aux = new ArrayList<>();
        String query = "SELECT *"
                + " FROM correos"
                + " WHERE asunto like %?%";

        try (Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC&useSS=false", "111mil", "111mil");
                PreparedStatement stmt = cnn.prepareStatement(query)) {
            stmt.setString(1, criterio);

            ResultSet rs = stmt.executeQuery();
            Correo oCorreo = null;
            while (rs.next()) {
                oCorreo = new Correo(rs.getString(2), rs.getString(3), rs.getDate(6), rs.getString(4));
                aux.add(oCorreo);
            }
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        } catch (CorreoInvalidoException ex) {
            throw new DaoExcepcion("Correo incorrecto!", ex);
        }

        return aux;

    }

    @Override
    public List<Correo> findByUsuario(int usuario) throws DaoExcepcion {
        List<Correo> aux = new ArrayList<>();
        String query = "SELECT *"
                + " FROM correos"
                + " WHERE id_usuario = ?";

        try (Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3333/correosDB?serverTimezone=UTC&useSS=false", "111mil", "111mil");
                PreparedStatement stmt = cnn.prepareStatement(query)) {
            stmt.setInt(1, usuario);

            ResultSet rs = stmt.executeQuery();
            Correo oCorreo = null;
            while (rs.next()) {
                oCorreo = new Correo(rs.getString(2), rs.getString(3), rs.getDate(6), rs.getString(4));
                aux.add(oCorreo);
            }
        } catch (SQLException ex) {
            throw new DaoExcepcion("Error de acceso a datos!", ex);
        } catch (CorreoInvalidoException ex) {
            throw new DaoExcepcion("Correo incorrecto!", ex);
        }
 
        return aux;
    }
}
