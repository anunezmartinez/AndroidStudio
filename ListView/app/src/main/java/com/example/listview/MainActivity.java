package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lista;
    private List<String> talleres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = findViewById(R.id.list_view);

        talleres = new ArrayList<>();
        talleres.add("Franco");
        talleres.add("franco");
        talleres.add("fRanCo");

        ArrayAdapter<String> adaptadorTalleres = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                talleres
        );

        lista.setAdapter(adaptadorTalleres);

        lista.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "El item seleccionado es el "+ talleres.get(position), Toast.LENGTH_SHORT).show();
    }
}
