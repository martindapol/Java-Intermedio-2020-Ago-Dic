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
public abstract class Televisor {

    protected int canal;
    private EstadoDispositivo estado;

   
    public static final int canalDefault;
    private static int contador;
    private final int nroSerie;

    static { // inicializadores estáticos
        canalDefault = 33;
        contador = 0;
    }

    public Televisor(int canal) {
        this.canal = canal;
        estado = EstadoDispositivo.APAGADO;
        contador++;
        nroSerie = contador;
    }

    public void encender() {
        estado = EstadoDispositivo.ENCENDIDO;
        canal = canalDefault;
    }

    public void apagar() {
        estado = EstadoDispositivo.APAGADO;
    }

    public abstract void cambiarCanal(int canal);

    
    public static int getContador() {
        return contador;
    }

    public void setEstado(EstadoDispositivo estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {

        if (estado == EstadoDispositivo.APAGADO ) {
            return "Televisor apagado!";
        }

        return "Televisor{" + "canal=" + canal + '}';
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public String mostrarEstado() {
       String aux = estado.toString();
        
        /*switch (estado) {
            case APAGADO:
                aux = "Encendido";
                break;
            case ENCENDIDO:
                aux = "Apagado";
                break;

            case STAND_BY:
                aux = "StandBy";
                break;
        }
    */    
    return aux;
    }

}
