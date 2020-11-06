/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.gui.JFLogin;
import java.io.IOException;
import javax.swing.UIManager;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
           
            UIManager.setLookAndFeel("net.sourceforge.napkinlaf.NapkinLookAndFeel");
            //initCorreos();
            new JFLogin().setVisible(true);
            
        }catch(Exception e){
            System.out.println("Error. No se puede ejecutar la aplicacón");
        }
    }

   /* private static void initCorreos() {
        CorreoDAO dao = new CorreoDAOFile();
        dao.add(new Correo("Test 1", "Correo de prueba", Calendar.getInstance().getTime(), "NPI"));
        dao.add(new Correo("Test 2", "Correo de prueba con magia", Calendar.getInstance().getTime(), "Anónimo"));
    }
    */
}
