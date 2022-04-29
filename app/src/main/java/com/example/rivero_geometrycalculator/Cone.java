package com.example.rivero_geometrycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rivero_geometrycalculator.ConeFomulas.ConeArea;
import com.example.rivero_geometrycalculator.ConeFomulas.ConeVolume;

public class Cone extends AppCompatActivity implements View.OnClickListener{

    Button btnConeArea, btnConeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        btnConeArea = findViewById(R.id.btnConeArea);
        btnConeVolume = findViewById(R.id.btnConeVolume);

        btnConeArea.setOnClickListener(this);
        btnConeVolume.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnConeArea:
                Intent intent = new Intent(this, ConeArea.class);
                startActivity(intent);
                break;
            case R.id.btnConeVolume:
                Intent intent2 = new Intent(this, ConeVolume.class);
                startActivity(intent2);
                break;
        }
    }
}

