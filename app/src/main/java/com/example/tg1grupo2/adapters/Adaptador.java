package com.example.tg1grupo2.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tg1grupo2.Datos_serie;
import com.example.tg1grupo2.Objserie.Serie;
import com.example.tg1grupo2.R;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Serie> series;

    public Adaptador(List<Serie> series) {

        this.series = series;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        Serie serie = series.get(position);
        holder.Titulo.setText(series.get(position).getTitulo());
        holder.año.setText(String.valueOf(series.get(position).getAño()));
        holder.numerotemporadas.setText(String.valueOf(series.get(position).getNumerotemporadas()));
        holder.idimagen.setImageResource(series.get(position).getIdimagen());

        holder.itemView.setOnClickListener(v ->{

            Intent intento = new Intent(v.getContext(), Datos_serie.class);
            intento.putExtra("intento",serie );
            v.getContext().startActivity(intento);

        });
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView Titulo;
        public TextView año,numerotemporadas;
        public ImageView idimagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Titulo = itemView.findViewById(R.id.txtTituloR);
            año = itemView.findViewById(R.id.txtAñoR);
            numerotemporadas = itemView.findViewById(R.id.txtTemporadasR);
            idimagen = itemView.findViewById(R.id.imgFoto);


        }
    }
}
