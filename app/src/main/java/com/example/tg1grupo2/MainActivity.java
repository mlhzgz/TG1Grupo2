package com.example.tg1grupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.tg1grupo2.Metodos.metodos;
import com.example.tg1grupo2.Objserie.Serie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<Serie> arrayseries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler(Looper.myLooper());
         arrayseries = metodos.arrayseries();

        handler.postDelayed(()->{
            Intent intent = new Intent(MainActivity.this,Recycler.class);
            startActivity(intent);
            finish();
        },2500);
    }
}