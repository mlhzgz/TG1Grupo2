package com.example.tg1grupo2.Metodos;

import android.widget.ImageView;
import android.widget.Toast;

import com.example.tg1grupo2.Objserie.Serie;

import java.util.ArrayList;

public class metodos {


 //Metodo para Crear las Series
    public static ArrayList<Serie> arrayseries(){
    ArrayList<Serie> series = new ArrayList<>();

    //SERIE 1

    String descripcion="Un Anime basado en la segunda guerra mundial donde nuestra protagonista desafiara a un ser divino y se alistará como soldado en las filas del Imperio";
    ArrayList<String> temporadas = new ArrayList<>();
    temporadas.add("Youjo Senki");
    temporadas.add("Youjo Senki Movie");

    int[] capxtemp = {12 , 1};

    Serie serie1 = new Serie("Youjo Senki",descripcion, temporadas,2017,2,,0,capxtemp);

    //SERIE 2

    descripcion = "Un anime isekai de tematica oscura donde nuestro protagonista se reencarnara como un Undead en un mundo de fantasia basado en un videojuego";
    temporadas.clear();
    temporadas.add("Overlord");
    temporadas.add("Overlord II");
    temporadas.add("Overlord III");
    temporadas.add("Overlord IV");
    capxtemp = new int[]{13,13,13,13};

    Serie serie2= new Serie("Overlord",descripcion,temporadas,2015,4,,0,capxtemp);

    //SERIE 3

    descripcion = "Un anime de accion y violencia que nos presenta a una organizacion que se dedica a cazar vampiros";
    temporadas.clear();
    temporadas.add("Hellsing Ultimate");
    capxtemp = new int[]{10};

    Serie serie3= new Serie("Hellsing Ultimate",descripcion,temporadas,2006,1,,0,capxtemp);

    //SERIE 4

    descripcion = "Un anime de thriller y misterio donde un medico se vera envuelto en un caso de asesinatos en serie";
    temporadas.clear();
    temporadas.add("Monster");
    capxtemp = new int[]{74};

    Serie serie4= new Serie("Monster",descripcion,temporadas,2004,1,,0,capxtemp);

    //Serie 5

    descripcion = "Un anime de accion y ciencia ficcion donde un joven maquinará un elaborado plan para revelarse contra la tirania de un imperio";
    temporadas.clear();
    temporadas.add("Code Geass: Hangyaku no Lelouch");
    temporadas.add("Code Geass: Hangyaku no Lelouch R2");
    capxtemp = new int[]{25,25};

    Serie serie5= new Serie("Code Geass: Hangyaku no Lelouch",descripcion,temporadas,2006,2,,0,capxtemp);

    //Serie 6

    descripcion = "Un anime de misterio donde nos presentaran al Detective de Preparatoria Shinichi Kudo y su objetivo de desenmascarar una peligrosa mafia";
    temporadas.clear();
    temporadas.add("Detective Conan");
    capxtemp = new int[]{1050};

    Serie serie6= new Serie("Detective Conan",descripcion,temporadas,1996,1,,0,capxtemp);

    //Serie 7

    descripcion = "Un anime de accion y disparos donde conoceremos a un grupo de cazarecompensas y su dia a dia lidiando con mafias y bandas";
    temporadas.clear();
    temporadas.add("Black Lagoon");
    temporadas.add("Black Lagoon: The Second Barrage");
    temporadas.add("Black Lagoon: Roberta's Blood Trail");
    capxtemp = new int[]{12,12,5};

    Serie serie7= new Serie("Black Lagoon",descripcion,temporadas,2006,3,,0,capxtemp);

    //Serie 8

    descripcion = "Un anime de comedia donde un jefe de la yakuza retirado intenta llevar una vida normal junto a su esposa";
    temporadas.clear();
    temporadas.add("Gokushufudou");
    temporadas.add("Gokushufudou Part 2");
    capxtemp = new int[]{5,5};

    Serie serie8= new Serie("Gokushufudou",descripcion,temporadas,2021,2,,0,capxtemp);

    //serie 9

    descripcion = "Un anime de accion ambientado en el japon feudal que nos cuenta la historia de un joven maldito pot un demonio";
    temporadas.clear();
    temporadas.add("Dororo");
    capxtemp = new int[]{24};

    Serie serie9= new Serie("Dororo",descripcion,temporadas,2021,1,,0,capxtemp);

    //Serie 10

    descripcion = "Un anime de carreras clandestinas de coches";
    temporadas.clear();
    temporadas.add("Initial D First Stage");
    temporadas.add("Initial D Second Stage");
    temporadas.add("Initial D Third Stage");
    temporadas.add("Initial D Fourth Stage");
    temporadas.add("Initial D Fifth Stage");
    temporadas.add("Initial D Final Stage");
    capxtemp = new int[]{26,13,1,24,14,4};

    Serie serie10= new Serie("Initial D",descripcion,temporadas,1998,6,,0,capxtemp);

    //Añadimos las series

    series.add(serie1);
    series.add(serie2);
    series.add(serie3);
    series.add(serie4);
    series.add(serie5);
    series.add(serie6);
    series.add(serie7);
    series.add(serie8);
    series.add(serie9);
    series.add(serie10);

    return series;
}





// Metodos para la Clase DATOS_SERIES

    //Cambiar la puntuacion de una serie
    public static Serie actualizapuntos(Serie serie,int puntos){

        serie.setPuntuacion(puntos);
        return serie;

    }

    //Cambiar la foto de las estrellas
    public static void cambiodefoto(ImageView imagen,int puntos){

        if(puntos==5){imagen.setImageResource();}
        else if(puntos==4){imagen.setImageResource();}
        else if(puntos==3){imagen.setImageResource();}
        else if(puntos==2){imagen.setImageResource();}
        else if(puntos==1){imagen.setImageResource();}
        else{imagen.setImageResource();}


    }

    //Hacer un Toas para indicar que se ha registrado la puntuacion
    public static void mensajedepuntuacion(Class clase){

        Toast.makeText( clase,"Puntuacion Actualizada",Toast.LENGTH_LONG).show();

    }
}
