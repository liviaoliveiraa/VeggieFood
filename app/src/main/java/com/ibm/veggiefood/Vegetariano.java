package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Vegetariano extends AppCompatActivity {

    Button btn;
    ImageButton cao, jok, kebab, rascal;
    ImageView cao_veio, jokemp, kebab_paris, rascal_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetariano);

        btn = findViewById(R.id.btn_votar);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cao = (ImageButton) findViewById(R.id.cao);
        cao_veio = (ImageView) findViewById(R.id.cao_veio);

        cao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cao_veio.setImageResource(R.mipmap.cao_veio);
            }
        });

        jok = (ImageButton) findViewById(R.id.jok);
        jokemp = (ImageView) findViewById(R.id.jokemp);

        jok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jokemp.setImageResource(R.mipmap.jokempoo);
            }
        });

        kebab = (ImageButton) findViewById(R.id.kebab);
        kebab_paris = (ImageView) findViewById(R.id.kebab_paris);

        kebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kebab_paris.setImageResource(R.mipmap.kebab);
            }
        });

        rascal = (ImageButton) findViewById(R.id.rascal);
        rascal_ = (ImageView) findViewById(R.id.rascal_);

        rascal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rascal_.setImageResource(R.mipmap.rascal);
            }
        });

    }

}