package com.marco.projetofragmentsservicesebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityService extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_service);
    }



    public void LigarAudio(View view) {
        Intent intent = new Intent(this,AudioService.class);
        startService(intent);
    }
    public void DesligarAudio(View view) {
        Intent intent = new Intent(this,AudioService.class);
        stopService(intent);
    }

    public void  VoltarMenu2(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();;
    }



}