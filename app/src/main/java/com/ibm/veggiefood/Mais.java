package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mais extends AppCompatActivity {

    Button curiosidades, transicao, alimentacao, saude, comunidade, btn_voltar_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mais);

        curiosidades = findViewById(R.id.curiosidades);
        transicao = findViewById(R.id.transicao);
        alimentacao = findViewById(R.id.alimentacao);
        saude = findViewById(R.id.saude);
        comunidade = findViewById(R.id.comunidade);

        curiosidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curi = new Intent(view.getContext(), Curiosidades.class);
                startActivity(curi);
            }
        });

        transicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transi = new Intent(view.getContext(), Transicao.class);
                startActivity(transi);
            }
        });

        alimentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ali = new Intent(view.getContext(), Alimentacao.class);
                startActivity(ali);
            }
        });

        saude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sau = new Intent(view.getContext(), Saude.class);
                startActivity(sau);
            }
        });

        comunidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comu = new Intent(view.getContext(), Comunidade.class);
                startActivity(comu);
            }
        });








        btn_voltar_principal = findViewById(R.id.btn_voltar_principal);
        btn_voltar_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}