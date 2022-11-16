package com.example.tg1grupo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tg1grupo2.Metodos.metodos;
import com.example.tg1grupo2.Objserie.Serie;

import java.util.ArrayList;

public class Datos_serie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_serie);

        ImageView imgPortada = findViewById(R.id.imgPortada);
        TextView nombre = findViewById(R.id.txtNombre);
        TextView anyoEmision = findViewById(R.id.txtAnyoEmision);
        EditText descripcion = findViewById(R.id.txtDescripcion);
        EditText temporadas = findViewById(R.id.txtTemporadas);
        EditText capsTemporadas = findViewById(R.id.txtCapsTemp);
        ImageView imgEstrellas = findViewById(R.id.imgEstrellas);

        int serieselec = 0; //<----- este valor lo tiene q traer el INTENT

        Serie serie = metodos.suichdeseries(serieselec);

        metodos.cargardatosdelaserie(serie,nombre,anyoEmision,descripcion,temporadas,capsTemporadas,imgPortada);
    /*    //Cargar la imagen de la serie

        int idImg = serie.getIdimagen();

        imgPortada.setImageResource(idImg);

        //Para cargar el año de emision de la serie

        String añoEmision = String.valueOf(serie.getAño());

        nombre.setText(serie.getTitulo());
        anyoEmision.setText(añoEmision);

        //Para cargar la descripicon de la serie

        descripcion.setText(serie.getDescripcion());
        descripcion.setFocusable(false);

        //Para cargar las temporadas de las series

        int numeroTemporadas = serie.getNumerotemporadas();

        String[] temporadaaas = new String[numeroTemporadas];

        String temporadasPrimeraSerie = "";

        for(int j = 0; j < numeroTemporadas; j++){
            temporadaaas[j] = String.valueOf(serie.getNombretemporadas());

            temporadas.setText("\n" + temporadaaas[j] );
        }
        //temporadasPrimeraSerie = String.valueOf(series.get(9).getNombretemporadas());


        temporadas.setFocusable(false);

        //Para cargar los capitulos de las temporadas

        int[] capTemp = serie.getCapitulosxtemporadas();

        String caps = "";

        for(int i = 0; i < serie.getNumerotemporadas(); i++){
            caps = caps + String.valueOf("\n" + capTemp[i]);
        }
        capsTemporadas.setText(caps);
        capsTemporadas.setFocusable(false);
*/
        //Alert dialog de puntuaciones
        imgEstrellas.setOnClickListener(v ->{
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Puntue la serie");

            LayoutInflater inflater = getLayoutInflater();

            View vista = inflater.inflate(R.layout.puntuacion_alert, null);
            alertDialog.setView(vista);

            alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    RadioButton radio1 = vista.findViewById(R.id.radio1);
                    RadioButton radio2 = vista.findViewById(R.id.radio2);
                    RadioButton radio3 = vista.findViewById(R.id.radio3);
                    RadioButton radio4 = vista.findViewById(R.id.radio4);
                    RadioButton radio5 = vista.findViewById(R.id.radio5);

                   int nuevapuntuacion = metodos.cambiodefotoestrellas(serie.getPuntuacion(), imgEstrellas,radio1,radio2,radio3,radio4,radio5);

                   serie.setPuntuacion(nuevapuntuacion);

                   /* if(radio1.isChecked())
                        imgEstrellas.setImageResource(R.drawable.imgunaestrella);
                    else if(radio2.isChecked()){
                        imgEstrellas.setImageResource(R.drawable.imgdosestrellas);
                    } else if(radio3.isChecked()){
                        imgEstrellas.setImageResource(R.drawable.imgtresestrellas);
                    } else if(radio4.isChecked()){
                        imgEstrellas.setImageResource(R.drawable.imgcuatroestrellas);
                    } else if(radio5.isChecked()){
                        imgEstrellas.setImageResource(R.drawable.imgcincoestrellas);
                    }*/
                    Toast.makeText( Datos_serie.this,"Puntuacion Actualizada",Toast.LENGTH_LONG).show();
                }
            });

            alertDialog.setNegativeButton("Borrar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    serie.setPuntuacion(0);
                    imgEstrellas.setImageResource(R.drawable.imgceroestrellas);
                    Toast.makeText( Datos_serie.this,"Puntuacion Borrada",Toast.LENGTH_LONG).show();
                }
            });
        /*    alertDialog.setOnCancelListener(dialogInterface -> {


            });*/
            alertDialog.show();
        });
    }
}