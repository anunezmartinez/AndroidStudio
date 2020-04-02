package com.example.multiscreen_tablet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout layout = findViewById(R.id.contenedor);

        if(layout != null){
            Toast.makeText(this, "Esto es una tablet", Toast.LENGTH_SHORT).show();

        } else{
            Toast.makeText(this, "Esto es un movil", Toast.LENGTH_SHORT).show();
        }
    }
}
