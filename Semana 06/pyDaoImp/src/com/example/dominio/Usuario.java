/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author MARTIN
 */
public class Usuario implements Serializable{
    private String nombre;
    private String clave;
    private Date ultimoAcceso;

    public Usuario(String nombre, String clave, Date ultimoAcceso) {
        this.nombre = nombre;
        this.clave = clave;
        this.ultimoAcceso = ultimoAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }
    
}
