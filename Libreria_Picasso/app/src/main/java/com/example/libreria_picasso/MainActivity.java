package com.example.libreria_picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logo = findViewById(R.id.imageviewlogo);

        Picasso
                .get()
                .load("http://i.imgur.com/DvpvklR.png")
                .into(logo);





    }
}
