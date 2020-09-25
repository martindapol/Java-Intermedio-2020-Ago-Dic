/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

import javax.swing.JOptionPane;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Televisor.canalDefault);
            
        Televisor t1 = new LEDTelevisor(2);
        System.out.println(t1.getNroSerie());
        
        
        Televisor t2 = new LEDTelevisor(7);
        
        EstadoDispositivo estado = EstadoDispositivo.APAGADO;
        t2.setEstado(estado);
        
       
        try{
            System.out.println(estado);
        
        }catch(Exception e){
            Singleton.getInstancia().addError(e.getMessage());
        
        }
        
        
        System.out.println("Estado t2: " + t2.mostrarEstado());
        
        t1.encender();
        System.out.println(t2.getNroSerie());
    }

    private static void mostrarTele() {
        System.out.println(Televisor.mostrar());

    }

}
