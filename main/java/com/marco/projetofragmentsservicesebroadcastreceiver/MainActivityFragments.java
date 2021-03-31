package com.marco.projetofragmentsservicesebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityFragments extends AppCompatActivity {

    Fragment1 frag1;
    Fragment2 frag2;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragments);
        frag1 = new Fragment1();
        frag2 = new Fragment2();
        MetodosetarFragmento(frag1,0);

    }

    public void frag1 (View view) {
        MetodosetarFragmento(frag1,1);
    }

    public void frag2(View view) {
        MetodosetarFragmento(frag2,1);
    }


    public void Voltar (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();;
    }

    public void MetodosetarFragmento(Fragment frag,int tipo){
        if(tipo == 0){
            fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment,frag).commit();
        }
        if(tipo == 1){
            fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment,frag).commit();
        }
    }
}