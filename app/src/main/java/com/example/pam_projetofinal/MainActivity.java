package com.example.pam_projetofinal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Colocar uma SplashScreen de 6 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Abrir a Activity Menu
                Intent i = new Intent(MainActivity.this, Menu.class);
                startActivity(i);
            }
        }, 6000);



    }
}