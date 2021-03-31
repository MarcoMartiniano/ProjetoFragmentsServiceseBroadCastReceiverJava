package com.marco.projetofragmentsservicesebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExemploBroadCastReceiver extends BroadcastReceiver {

    //ABRIR APP QUANDO LIGAR O CELULAR

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()) ){
            Intent it = new Intent(context,MainActivity.class);
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(it);

        }
        //Toast.makeText(context,"BROADCAST SETADO PARA INICIAR APP NO BOOT DO SMARTPHONE",Toast.LENGTH_LONG).show();
    }


}
