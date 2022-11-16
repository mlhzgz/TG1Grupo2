package com.example.tg1grupo2.Metodos;

import android.widget.ImageView;
import android.widget.Toast;

import com.example.tg1grupo2.Objserie.Serie;
import com.example.tg1grupo2.R;

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

    Serie serie1 = new Serie("Youjo Senki",descripcion, temporadas,2017,2,R.drawable.youjosenki,0,capxtemp);

    //SERIE 2

    descripcion = "Un anime isekai de tematica oscura donde nuestro protagonista se reencarnara como un Undead en un mundo de fantasia basado en un videojuego";

    ArrayList<String> temporadas2 = new ArrayList<>();


    temporadas2.add("Overlord");
    temporadas2.add("Overlord II");
    temporadas2.add("Overlord III");
    temporadas2.add("Overlord IV");
    capxtemp = new int[]{13,13,13,13};

    Serie serie2= new Serie("Overlord",descripcion,temporadas2,2015,4,R.drawable.overlord,0,capxtemp);

    //SERIE 3

    descripcion = "Un anime de accion y violencia que nos presenta a una organizacion que se dedica a cazar vampiros";


    ArrayList<String> temporadas3 = new ArrayList<>();

    temporadas3.add("Hellsing Ultimate");
    capxtemp = new int[]{10};

    Serie serie3= new Serie("Hellsing Ultimate",descripcion,temporadas3,2006,1,R.drawable.hellsing,0,capxtemp);

    //SERIE 4

    descripcion = "Un anime de thriller y misterio donde un medico se vera envuelto en un caso de asesinatos en serie";


    ArrayList<String> temporadas4 = new ArrayList<>();

    temporadas4.add("Monster");
    capxtemp = new int[]{74};

    Serie serie4= new Serie("Monster",descripcion,temporadas4,2004,1,R.drawable.monster,0,capxtemp);

    //Serie 5

    descripcion = "Un anime de accion y ciencia ficcion donde un joven maquinará un elaborado plan para revelarse contra la tirania de un imperio";


    ArrayList<String> temporadas5 = new ArrayList<>();

    temporadas5.add("Code Geass: Hangyaku no Lelouch");
    temporadas5.add("Code Geass: Hangyaku no Lelouch R2");
    capxtemp = new int[]{25,25};

    Serie serie5= new Serie("Code Geass: Hangyaku no Lelouch",descripcion,temporadas5,2006,2,R.drawable.codegeas,0,capxtemp);

    //Serie 6

    descripcion = "Un anime de misterio donde nos presentaran al Detective de Preparatoria Shinichi Kudo y su objetivo de desenmascarar una peligrosa mafia";


    ArrayList<String> temporadas6 = new ArrayList<>();

    temporadas6.add("Detective Conan");
    capxtemp = new int[]{1050};

    Serie serie6= new Serie("Detective Conan",descripcion,temporadas6,1996,1,R.drawable.detectiveconan,0,capxtemp);

    //Serie 7

    descripcion = "Un anime de accion y disparos donde conoceremos a un grupo de cazarecompensas y su dia a dia lidiando con mafias y bandas";


    ArrayList<String> temporadas7 = new ArrayList<>();

    temporadas7.add("Black Lagoon");
    temporadas7.add("Black Lagoon: The Second Barrage");
    temporadas7.add("Black Lagoon: Roberta's Blood Trail");
    capxtemp = new int[]{12,12,5};

    Serie serie7= new Serie("Black Lagoon",descripcion,temporadas7,2006,3,R.drawable.blacklaggon,0,capxtemp);

    //Serie 8

    descripcion = "Un anime de comedia donde un jefe de la yakuza retirado intenta llevar una vida normal junto a su esposa";


    ArrayList<String> temporadas8 = new ArrayList<>();

    temporadas8.add("Gokushufudou");
    temporadas8.add("Gokushufudou Part 2");
    capxtemp = new int[]{5,5};

    Serie serie8= new Serie("Gokushufudou",descripcion,temporadas8,2021,2,R.drawable.yakuza,0,capxtemp);

    //serie 9

    descripcion = "Un anime de accion ambientado en el japon feudal que nos cuenta la historia de un joven maldito pot un demonio";


    ArrayList<String> temporadas9 = new ArrayList<>();

    temporadas9.add("Dororo");
    capxtemp = new int[]{24};

    Serie serie9= new Serie("Dororo",descripcion,temporadas9,2021,1,R.drawable.dororo,0,capxtemp);

    //Serie 10

    descripcion = "Un anime de carreras clandestinas de coches";


    ArrayList<String> temporadas10 = new ArrayList<>();

    temporadas10.add("Initial D First Stage");
    temporadas10.add("Initial D Second Stage");
    temporadas10.add("Initial D Third Stage");
    temporadas10.add("Initial D Fourth Stage");
    temporadas10.add("Initial D Fifth Stage");
    temporadas10.add("Initial D Final Stage");
    capxtemp = new int[]{26,13,1,24,14,4};

    Serie serie10= new Serie("Initial D",descripcion,temporadas10,1998,6,R.drawable.intiald,0,capxtemp);

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
    /*public static void cambiodefoto(ImageView imagen,int puntos){

        if(puntos==5){imagen.setImageResource(R.drawable);}
        else if(puntos==4){imagen.setImageResource(R.drawable);}
        else if(puntos==3){imagen.setImageResource(R.drawable);}
        else if(puntos==2){imagen.setImageResource(R.drawable);}
        else if(puntos==1){imagen.setImageResource(R.drawable);}
        else{imagen.setImageResource(R.drawable);}


    }*/

    //Hacer un Toast para indicar que se ha registrado la puntuacion
    /*public static void mensajedepuntuacion(Class clase){

        Toast.makeText( clase,"Puntuacion Actualizada",Toast.LENGTH_LONG).show();

    }*/
}
