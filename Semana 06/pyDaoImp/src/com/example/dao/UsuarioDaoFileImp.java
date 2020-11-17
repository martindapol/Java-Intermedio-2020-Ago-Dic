/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.dominio.Usuario;
import com.example.excepciones.DaoExcepcion;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class UsuarioDaoFileImp implements UsuarioDao {

    private static final String FILE_NAME = "usuarios.dat";

    public UsuarioDaoFileImp() {
        checkFileExist();
    }

    @Override
    public void create(Usuario u) throws DaoExcepcion {
        List lst = readAll();
        lst.add(u);
        write(lst);
    }

    @Override
    public Usuario validate(String n, String p) throws DaoExcepcion {
        Usuario user;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            
           
            
            while (true) {
                user = (Usuario) ois.readObject();
                if (user.getNombre().equals(n) && user.getClave().equals(p)) {
                    break;
                }
            }

        } catch (EOFException eof) {
            user = null;
        } catch (ClassNotFoundException | IOException e) {
            throw new DaoExcepcion("Error al recuperar los usuarios", e);
        }
        return user;
    }

    private List<Usuario> readAll() throws DaoExcepcion {
        List<Usuario> lst = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                lst.add((Usuario) ois.readObject());
            }

        } catch (EOFException eof) {
        } catch (ClassNotFoundException | IOException e) {
            throw new DaoExcepcion("Error al recuperar los usuarios", e);
        }
        return lst;
    }

    private void write(List<Usuario> lst) throws DaoExcepcion {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Usuario user : lst) {
                oos.writeObject(user);
            }
        } catch (IOException e) {
            throw new DaoExcepcion("Error al recuperar los usuarios", e);
        }
    }

    private void checkFileExist() {
        if (Files.notExists(Paths.get(FILE_NAME))) {
            try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
               //crea el archivo la primera vez...
            } catch (IOException e) {
            }
        }
    }

    @Override
    public List<Correo> inBox(int id) throws DaoExcepcion {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
