/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

import com.example.excepciones.CorreoInvalidoException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MARTIN
 */
public class Correo implements Serializable{
    private String asunto;
    private String cuerpo;
    private Date fecha;
    private String remitente;

    public Correo(String asunto, String cuerpo, Date fecha, String remitente) throws CorreoInvalidoException {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.setRemitente(remitente);
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

    public void setRemitente(String remitente) throws CorreoInvalidoException{
        //validación de dominio:
        if(remitente != null && formatoCorreoValido(remitente))
            this.remitente = remitente;
        else
           throw new CorreoInvalidoException(remitente);
    }

    @Override
    public String toString() {
        return "Correo de: " + remitente + "| Asunto: " + asunto;
    }

    public Object[] toArray() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new Object[]{asunto, cuerpo, sdf.format(fecha), remitente};
    }

    private boolean formatoCorreoValido(String remitente) {
        Pattern pattern = Pattern.compile("(\\S+?)\\@(\\S+?)\\.com");
        Matcher matcher = pattern.matcher(remitente);
        return matcher.find();
    }
}
