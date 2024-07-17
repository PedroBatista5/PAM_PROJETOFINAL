package com.example.pam_projetofinal;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cara_Coroa extends AppCompatActivity {

    //Criar variaveis
    ImageView cara, coroa;
    Button bt_cara, bt_coroa;
    String valor;
    int g = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_coroa);

        // Ir buscar os objetos do layout e colocar nas variaveis
        cara = findViewById(R.id.iv_caraa);
        coroa = findViewById(R.id.iv_coroaa);
        bt_cara = findViewById(R.id.bt_Cara);
        bt_coroa = findViewById(R.id.bt_Coroa);

        //Criar um CountDownTimer para colocar as moedas a rodar
        new CountDownTimer(1000000, 50)//a cada 50 milissegundos
        {
            @Override
            public void onTick(long l)//As moedas giram 5 graus a cada Tick
            {
                g += 5;
                cara.setRotation(g);
                coroa.setRotation(g);
            }

            public void onFinish() {

            }
        }.start();//Começar o CountDownTimer

        bt_cara.setOnClickListener(new View.OnClickListener() { //Quando clicar no Button bt_cara
            @Override
            public void onClick(View view) { //Abrir a Activity SplashScreenComecar e mandar a variavel "valor" com valor "0"
                valor = "0";
                Intent i = new Intent(Cara_Coroa.this, SplashScreenComecar.class);
                i.putExtra("valor", valor);
                startActivity(i);
            }
        });

        bt_coroa.setOnClickListener(new View.OnClickListener() { //Quando clicar no Button bt_coroa
            @Override
            public void onClick(View view) { //Abrir a Activity SplashScreenComecar e mandar a variavel "valor" com valor "1"
                valor = "1";
                Intent i = new Intent(Cara_Coroa.this, SplashScreenComecar.class);
                i.putExtra("valor", valor);
                startActivity(i);
            }
        });


    }
}