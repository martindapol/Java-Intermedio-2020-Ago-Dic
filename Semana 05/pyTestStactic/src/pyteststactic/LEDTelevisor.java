/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyteststactic;

/**
 *
 * @author MARTIN
 */
public class LEDTelevisor extends Televisor{
    
    public LEDTelevisor(int canal) {
        super(canal);
    }

    @Override
    public void cambiarCanal(final int canal) {
        this.canal = canal;
    }
    
    
    
    
}
