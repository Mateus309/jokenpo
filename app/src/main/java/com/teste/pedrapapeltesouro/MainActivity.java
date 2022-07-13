package com.teste.pedrapapeltesouro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int opcaoSelecionada;
    int num;

    public int sorteiaNum(){
        Random random = new Random();
        return num = random.nextInt(3);
    }

    public void selecionaPedra(View view){
        opcaoSelecionada = 0;
        Resultado(this.opcaoSelecionada);
    }

    public void selecionaPapel(View view){
        opcaoSelecionada = 1;
        Resultado(this.opcaoSelecionada);
    }

    public void selecionaTesoura(View view){
        opcaoSelecionada = 2;
        Resultado(this.opcaoSelecionada);
    }

    @SuppressLint("ResourceType")
    void Resultado(int opcaoSelecionada){
        ImageView imgResult = findViewById(R.id.imageView3);
        if(sorteiaNum() == opcaoSelecionada){
            imgResult.setImageResource(R.drawable.pedra);
        }else if(opcaoSelecionada == 1) {
            imgResult.setImageResource(R.drawable.papel);
        }else if(opcaoSelecionada == 2) {
            imgResult.setImageResource(R.drawable.tesoura);
        }
    }




}