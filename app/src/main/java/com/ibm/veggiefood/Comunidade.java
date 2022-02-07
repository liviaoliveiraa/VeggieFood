package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comunidade extends AppCompatActivity {

    Button voltar_comunidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunidade);

        voltar_comunidade = findViewById(R.id.volar_comunidade);

        voltar_comunidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}