/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.generics.vehiculos;

/**
 *
 * @author george
 */
public class Automovil extends Vehiculo{
    
    public Automovil(int modelo, String descripcion, String patente) {
        super(modelo, descripcion, patente);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Automovil)){
            return false;
        }
        
        Automovil otro = (Automovil) obj;
        if(otro.getPatente().equals(this.getPatente())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getPatente().hashCode();
    }

 
    
}
