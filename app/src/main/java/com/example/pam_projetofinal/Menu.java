package com.example.pam_projetofinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    //Criar variaveis
    Button sobre, comecar, comojogar;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Ir buscar os Buttons do layout e colocar nas variaveis
        sobre = findViewById(R.id.bt_sobre);
        comecar = findViewById(R.id.bt_comecar);
        comojogar = findViewById(R.id.bt_comojogar);

        sobre.setOnClickListener(new View.OnClickListener() {//Iniciar Button sobre
            @Override
            public void onClick(View view)
            {
                //Abrir a Activity Sobre
                Intent i = new Intent (Menu.this, Sobre.class);
                startActivity(i);
            }
        });

        comecar.setOnClickListener(new View.OnClickListener() { //Iniciar Button comecar
            @Override
            public void onClick(View view)
            {
                //Abrir a Activity Cara_Coroa
                Intent i = new Intent (Menu.this, Cara_Coroa.class);
                startActivity(i);
            }
        });

        comojogar.setOnClickListener(new View.OnClickListener() { //Iniciar Button comojogar
            @Override
            public void onClick(View view)
            {
                //Abrir a Activity Ajuda
                Intent i = new Intent (Menu.this, Ajuda.class);
                startActivity(i);
            }
        });

    }
}