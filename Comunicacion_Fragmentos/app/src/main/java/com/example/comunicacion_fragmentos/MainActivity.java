package com.example.comunicacion_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements onControlesFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new ControlesFragment())
                .commit();
    }

    @Override
    public void botonColorClicked(String color) {
        Toast.makeText(this, "He recibido el color : " + color, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void botonTextoClicked(String texto) {
        Toast.makeText(this, "He recibido el texto : " + texto, Toast.LENGTH_SHORT).show();
    }
}
