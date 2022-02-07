package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Vegano extends AppCompatActivity {

    Button btn_voltar_vegano;
    ImageButton test, casa, vegan, banana;
    ImageView img, casaraw, vegan_co, banana_verde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegano);

        test = (ImageButton) findViewById(R.id.test);
        img = (ImageView) findViewById(R.id.imageView);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.mipmap.maha1);
            }
        });

        casa = (ImageButton) findViewById(R.id.casa_raw);
        casaraw = (ImageView) findViewById(R.id.casaraw);

        casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                casaraw.setImageResource(R.mipmap.casaraww);
            }
        });

        vegan = (ImageButton) findViewById(R.id.vegan);
        vegan_co = (ImageView) findViewById(R.id.vegan_co);

        vegan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vegan_co.setImageResource(R.mipmap.vegan);
            }
        });

        banana = (ImageButton) findViewById(R.id.banana);
        banana_verde = (ImageView) findViewById(R.id.banana_verde);

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                banana_verde.setImageResource(R.mipmap.banana);
            }
        });

        btn_voltar_vegano = findViewById(R.id.btn_voltar_vegano);

        btn_voltar_vegano.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}