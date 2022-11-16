package com.example.tg1grupo2.Objserie;

import java.util.ArrayList;

public class Serie {
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

    public void setCapitulosxtemporadas(int[] capitulosxtemporadas) {
        this.capitulosxtemporadas = capitulosxtemporadas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public ArrayList<String> getNombretemporadas() {
        return nombretemporadas;
    }

    public void setNombretemporadas(ArrayList<String> nombretemporadas) {
        this.nombretemporadas = nombretemporadas;
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

    public void setNumerotemporadas(int numerotemporadas) {
        this.numerotemporadas = numerotemporadas;
    }

    public int getIdimagen() {
        return idimagen;
    }

    public void setIdimagen(int idimagen) {
        this.idimagen = idimagen;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
