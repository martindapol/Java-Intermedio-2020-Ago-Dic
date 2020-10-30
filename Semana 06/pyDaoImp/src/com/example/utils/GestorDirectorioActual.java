/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTIN
 */
public class GestorDirectorioActual {
    public static void checkDirectorioActual(String dir){
        Path actual = Paths.get(".");
        Path ws = Paths.get(dir);
        
        if(!Files.exists(ws)){
            try {
                Files.createDirectory(ws);
                Path icon = Paths.get("images/user.png");
                System.out.println(Files.isDirectory(icon));
                Path iconCopy = Paths.get( dir + "/user.png");
                if(Files.exists(icon))
                    Files.copy(icon, iconCopy,StandardCopyOption.REPLACE_EXISTING); 
            } catch (IOException ex) {
                System.err.println("Error. NO se pudo crear el espacio de trabajo para el usuario: " + dir);
            }
        }
        
    }
}
