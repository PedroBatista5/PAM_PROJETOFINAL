package com.example.pam_projetofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sobre extends AppCompatActivity {

    //Criar variaveis
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        // Ir buscar os Buttons do layout e colocar nas variaveis
        voltar = findViewById(R.id.bt_sobrevoltar);

        voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Abrir a Activity Menu
                Intent i = new Intent (Sobre.this, Menu.class);
                startActivity(i);
            }
        });
    }
}