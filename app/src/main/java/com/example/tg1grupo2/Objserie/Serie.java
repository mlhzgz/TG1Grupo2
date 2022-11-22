package com.example.tg1grupo2.Objserie;

import java.io.Serializable;
import java.util.ArrayList;

public class Serie implements Serializable {
    private final int Id;
    String Titulo,Descripcion;
    ArrayList<String>nombretemporadas;
    int año,numerotemporadas,idimagen,puntuacion;
    int[] capitulosxtemporadas;
    
    public Serie(int id,String titulo, String descripcion, ArrayList<String> nombretemporadas, int año, int numerotemporadas, int idimagen, int puntuacion, int[] capitulosxtemporadas) {
        this.Id = id;
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.nombretemporadas = nombretemporadas;
        this.año = año;
        this.numerotemporadas = numerotemporadas;
        this.idimagen = idimagen;
        this.puntuacion = puntuacion;
        this.capitulosxtemporadas = capitulosxtemporadas;
    }

    public int getId() {
        return Id;
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
