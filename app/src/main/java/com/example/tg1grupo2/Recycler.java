package com.example.tg1grupo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.tg1grupo2.Metodos.metodos;
import com.example.tg1grupo2.Objserie.Serie;
import com.example.tg1grupo2.adapters.Adaptador;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    static ArrayList <Serie>  arrayseries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        Intent intent = getIntent();
        arrayseries = (ArrayList<Serie>) intent.getSerializableExtra("series");

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(new Adaptador(arrayseries));
    }

}