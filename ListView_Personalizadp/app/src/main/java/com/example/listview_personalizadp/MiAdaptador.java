package com.example.listview_personalizadp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class MiAdaptador extends ArrayAdapter<Averias> {

    Context ctx;
    int layoutTemplate;
    List<Averias> averiasList;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List<Averias> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layoutTemplate = resource;
        this.averiasList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        @SuppressLint("ViewHolder") View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);
        Averias elementoActual = averiasList.get(position);
        TextView textViewTitulo = v.findViewById(R.id.textViewTitulo);
        TextView textView2 = v.findViewById(R.id.textView2);
        TextView textView3 = v.findViewById(R.id.textView3);
        textViewTitulo.setText(elementoActual.getTitulo());
        textView2.setText(elementoActual.getModeloCoche());
        textView3.setText(elementoActual.getNumeroPresupuesto());
        return v;
    }
}
