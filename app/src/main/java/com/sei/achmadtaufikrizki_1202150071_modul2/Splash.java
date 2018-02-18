package com.sei.achmadtaufikrizki_1202150071_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    //Set lama waktu untuk menampilkan splashscreen dalam milisecond
    private static int splashInterval = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this,"AchmadTaufikRizki_1202150071",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent
                //jeda setelah selesai Splashscreen
            }
        }, splashInterval);

    }

    ;
}