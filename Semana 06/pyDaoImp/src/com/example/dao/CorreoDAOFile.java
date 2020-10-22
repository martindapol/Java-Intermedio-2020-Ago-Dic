/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MARTIN
 */
public class CorreoDAOFile implements CorreoDAO{
    private static final String FILE_NAME = "datos.dat";
            
            
    @Override
    public void add(Correo correo) {
        List<Correo> aux = null;
        //leer lista de objetos desde el archivo:
        aux = readFile();
        if(aux == null)
            aux = new ArrayList<>();
        aux.add(correo);
        //escribir lista de objetos al archivo:
        save(aux);
    }

    @Override
    public List<Correo> findByAsunto(String criterio) {
        List<Correo> aux = new ArrayList<>();
        List<Correo> lst = readFile();
        Pattern pattern = Pattern.compile(criterio);
        for (Correo correo : lst) {
              Matcher matcher = pattern.matcher(correo.getAsunto());
              if(matcher.find())
                aux.add(correo);
        }
        return aux;
    }

    private List<Correo> readFile() {
        List<Correo> data = null;
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                data = (List<Correo>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Error al procesar el archivo!");
        }
        
        return data;
    }

    private void save(List<Correo> aux) {
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(aux);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo!");
        }
    }
    
    
    
    
}
