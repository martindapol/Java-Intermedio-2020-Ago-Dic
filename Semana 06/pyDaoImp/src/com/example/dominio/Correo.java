/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author MARTIN
 */
public class Correo implements Serializable{
    private String asunto;
    private String cuerpo;
    private Date fecha;
    private String remitente;

    public Correo(String asunto, String cuerpo, Date fecha, String remitente) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.remitente = remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "Correo de: " + remitente + "| Asunto: " + asunto;
    }

    public Object[] toArray() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new Object[]{asunto, cuerpo, sdf.format(fecha), remitente};
    }
}
