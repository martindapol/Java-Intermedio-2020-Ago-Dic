/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import com.example.excepciones.DaoExcepcion;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class CorreoDaoFileOne implements CorreoDAO{
    private static final String FILE_NAME = "datos.dat";
        
    @Override
    public void add(Correo correo) throws DaoExcepcion  {
        List<Correo> lst = readFile();
        lst.add(correo);
        save(lst);
        
    }

    @Override
    public List<Correo> findByAsunto(String criterio) throws DaoExcepcion {
        List<Correo> lst = readFile();
        //IDEM PROCESO ANTERIOR!
        return lst;
    }
    
    private List<Correo> readFile() throws DaoExcepcion {
        List<Correo> data = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            while(true){
                Correo x = (Correo)ois.readObject();
                data.add(x);
            }
            
        } catch (EOFException e) {
            //FIN DE ARCHIVO!
        }catch (ClassNotFoundException | IOException e) {
            throw new DaoExcepcion("Error al procesar el archivo", e);
        }
        
        return data;
    }
    
    private void save(List<Correo> aux) throws DaoExcepcion{
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Correo correo : aux) {
                oos.writeObject(aux);
            }
        } catch (IOException e) {
           throw new DaoExcepcion("Error al procesar el archivo", e);
        }
    }
}
