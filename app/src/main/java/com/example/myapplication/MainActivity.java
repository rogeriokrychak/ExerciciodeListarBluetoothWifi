package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBluetooth;
    Button btnWiFi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBluetooth = findViewById(R.id.btnBluetooth);
        btnWiFi = findViewById(R.id.btnWiFi);
    }

    //Código para chamar a tela de bluetooth
    public void startBluetooth(View v){
        Intent bluetooth = new Intent(MainActivity.this, ActivityBluetooth.class);
        startActivity(bluetooth);
    }

    //Código para chamar a tela de Wifi
    public void startWiFi(View v){
        Intent wiFi = new Intent(MainActivity.this, ActivityWiFi.class);
        startActivity(wiFi);
    }
}