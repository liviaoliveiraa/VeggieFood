package com.ibm.veggiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_vegetariano, btn_vegano, btn_mais, btn_help;
    private Button msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_vegetariano = findViewById(R.id.btn_vegetariano);
        btn_vegano = findViewById(R.id.btn_vegano);
        btn_mais = findViewById(R.id.btn_mais);


        btn_vegetariano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xuxa = new Intent(view.getContext(), Vegetariano.class);
                startActivity(xuxa);
            }
        });

        btn_vegano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paquita = new Intent(view.getContext(), Vegano.class);
                startActivity(paquita);
            }
        });

        btn_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mais = new Intent(view.getContext(), Mais.class);
                startActivity(mais);
            }
        });


        msg = (Button) findViewById(R.id.msg);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });


    }

    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
