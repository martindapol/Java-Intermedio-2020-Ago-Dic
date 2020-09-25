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
public enum EstadoDispositivo {
    ENCENDIDO("Cuando se prede!"),
    APAGADO("Cuando se apaga!"),
    STAND_BY ("Cuando no sabes que le pasa!");
    
    private String desc;

    private EstadoDispositivo(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.ordinal() + "-" + desc;
    }

    
}
