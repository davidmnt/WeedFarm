package com.example.weedfarm.Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.weedfarm.R;

public class MainActivity extends AppCompatActivity {
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton buttonPlanta = findViewById(R.id.Planta);
        TextView puntuacion = findViewById(R.id.puntuacion);
        ImageButton mejoras = findViewById(R.id.menu_mejoras);

        Dialog dialogMejora = new Dialog(this);
        View popupViewJuegoMesa = getLayoutInflater().inflate(R.layout.card_mejoras, null);
        dialogMejora.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialogMejora.setContentView(popupViewJuegoMesa);
        Animation animacionMejora = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_from_right);

        mejoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupViewJuegoMesa.startAnimation(animacionMejora);
                dialogMejora.show();


            }
        });


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