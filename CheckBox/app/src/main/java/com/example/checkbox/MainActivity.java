package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ch1(View view) {

        CheckBox obj = (CheckBox) view;
        boolean anw = obj.isChecked();
        String tipo = "";
        switch(view.getId()){
            case R.id.checkbox1 :
                tipo = "Check box 1 clicada";
                break;

            case R.id.checkbox2:
                tipo = "Check box 2 clicada";
                break;
        }
        Toast.makeText(this, tipo + " "+ anw ,Toast.LENGTH_SHORT).show();
    }

}
