package com.example.tg1grupo2.Objserie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tg1grupo2.Metodos.metodos;
import com.example.tg1grupo2.R;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        ArrayList arraylist = metodos.arrayseries();
        recycler.setAdapter(new Adaptador(arraylist));
    }
}