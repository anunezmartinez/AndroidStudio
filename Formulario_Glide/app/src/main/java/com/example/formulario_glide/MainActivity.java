package com.example.formulario_glide;

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

        logo = findViewById(R.id.imageViewLogo);
        RequestOptions cropOptions = new RequestOptions().centerCrop();
        Glide.with(this).load("http://www.miguelcamposrivera.com/logo_mecaround.png").apply(cropOptions.fitCenter()).into(logo);
    }
}
