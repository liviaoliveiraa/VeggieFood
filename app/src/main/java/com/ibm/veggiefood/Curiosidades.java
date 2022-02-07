package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Curiosidades extends AppCompatActivity {

    Button voltar_curiosidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades);

        voltar_curiosidades = findViewById(R.id.volar_curiosidades);

        voltar_curiosidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}