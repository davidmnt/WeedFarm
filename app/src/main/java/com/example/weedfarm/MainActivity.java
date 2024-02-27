package com.example.weedfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton buttonPlanta = findViewById(R.id.Planta);
        TextView puntuacion = findViewById(R.id.puntuacion);

        buttonPlanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int PUNTOSSUMA = 1;


                cont += PUNTOSSUMA;

                String result = String.valueOf(cont);
                puntuacion.setText(result);


            }
        });



    }
}