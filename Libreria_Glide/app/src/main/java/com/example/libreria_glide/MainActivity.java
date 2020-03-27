package com.example.libreria_glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestOptions position = new RequestOptions().fitCenter();
        logo = findViewById(R.id.imageviewlogo);
        Glide.with(this).load("http://i.imgur.com/DvpvklR.png").apply(position).into(logo);
    }
}
