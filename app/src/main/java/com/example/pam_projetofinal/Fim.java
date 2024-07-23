package com.example.pam_projetofinal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fim extends AppCompatActivity {

    //Criar variaveis
    TextView msg1, msg2;
    pl.droidsonroids.gif.GifImageView gif;
    Intent intent;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        // Ir buscar os objetos do layout e colocar nas variaveis
        msg1 = findViewById(R.id.mensagem1);
        msg2 = findViewById(R.id.mensagem2);
        gif = findViewById(R.id.iv_fim);
        bt = findViewById(R.id.bt_menu);

        // Receber dados enviados da Activity SplashScreenComecar
        intent = getIntent();
        Bundle extras = intent.getExtras();
        String fim = extras.getString("caracoroa");
        String qual = extras.getString("valor");
        if(fim.equals("0")) //Caso seja "0" o utilizador ganhou
        {
            //TextViews e GIF definida caso ganhe
            gif.setBackgroundResource(R.drawable.ganhar);
            if(qual.equals("0"))
            {
                msg1.setText("Cara");
                msg2.setText("GANHASTE");
            }
            else
            {
                msg1.setText("Coroa");
                msg2.setText("GANHASTE");
            }

        }
        else{
            //TextViews e GIF definida caso perca
            gif.setBackgroundResource(R.drawable.perder);
            if(qual.equals("0"))
            {
                msg1.setText("Cara");
                msg2.setText("PERDESTE");
            }
            else
            {
                msg1.setText("Coroa");
                msg2.setText("PERDESTE");
            }
        }

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Abrir a Activity Menu
                Intent i = new Intent(Fim.this, Menu.class);
                startActivity(i);
            }
        });
    }
}