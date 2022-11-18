package com.example.tg1grupo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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

        Intent intent = getIntent();
        Serie serie = (Serie) intent.getSerializableExtra("intento");   //<----- este valor lo tiene q traer el INTENT

        metodos.cargardatosdelaserie(serie,nombre,anyoEmision,descripcion,temporadas,capsTemporadas,imgPortada);

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

            alertDialog.show();
        });
    }
}