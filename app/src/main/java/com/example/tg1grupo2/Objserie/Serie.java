package com.example.tg1grupo2.Objserie;

import java.io.Serializable;
import java.util.ArrayList;

public class Serie implements Serializable {
    String Titulo,Descripcion;
    ArrayList<String>nombretemporadas;
    int año,numerotemporadas,idimagen,puntuacion;
    int[] capitulosxtemporadas;
    
    public Serie(String titulo, String descripcion, ArrayList<String> nombretemporadas, int año, int numerotemporadas, int idimagen, int puntuacion, int[] capitulosxtemporadas) {
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.nombretemporadas = nombretemporadas;
        this.año = año;
        this.numerotemporadas = numerotemporadas;
        this.idimagen = idimagen;
        this.puntuacion = puntuacion;
        this.capitulosxtemporadas = capitulosxtemporadas;
    }

    public int[] getCapitulosxtemporadas() {
        return capitulosxtemporadas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public ArrayList<String> getNombretemporadas() {
        return nombretemporadas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumerotemporadas() {
        return numerotemporadas;
    }

    public int getIdimagen() {
        return idimagen;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
