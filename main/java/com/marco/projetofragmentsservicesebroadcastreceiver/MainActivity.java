package com.marco.projetofragmentsservicesebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ActivityService(View view){
        Intent intent = new Intent(this,MainActivityService.class);
        startActivity(intent);
        finish();;
    }

    public void BroadCasteReceiverClass (View view){
        Toast.makeText(this,"BROADCAST SETADO PARA INICIAR APP NO BOOT DO SMARTPHONE",Toast.LENGTH_LONG).show();
    }

    public void ActivityFragments(View view){
        Intent intent = new Intent(this,MainActivityFragments.class);
        startActivity(intent);
        finish();;
    }


    public void Sair (View view){
        finish();;
    }
}