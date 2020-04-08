package com.example.listview_personalizadp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    List<Averias> averiaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.listview);
        averiaList = new ArrayList<>();
        averiaList.add(new Averias("Espejo roto","Audi", 12));
        averiaList.add(new Averias("Espejo asd","Audi2", 12));
        averiaList.add(new Averias("Esasddaso","Audi3", 12));
        averiaList.add(new Averias("Espejo roto","Audi4", 12));
        MiAdaptador adaptador = new MiAdaptador(
                this,
                R.layout.averia_item,
                averiaList
        );
        lista.setAdapter(adaptador);
    }
}
