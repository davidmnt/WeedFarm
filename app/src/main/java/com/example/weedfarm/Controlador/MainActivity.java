package com.example.weedfarm.Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.weedfarm.R;

public class MainActivity extends AppCompatActivity {
    boolean movimientoMejora = false;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton buttonPlanta = findViewById(R.id.Planta);
        TextView puntuacion = findViewById(R.id.puntuacion);
        ImageButton mejoras = findViewById(R.id.menu_mejoras);
        LinearLayout linearMejora = findViewById(R.id.linearMenu);
        ScrollView scrollMejora = findViewById(R.id.scrollMejora);

        mejoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(movimientoMejora == false) {

                    scrollMejora.animate().x(300).setDuration(500).start();
                    mejoras.animate().x(160).setDuration(500).start();
                    movimientoMejora = true;

                }else{
                    scrollMejora.animate().x(750).setDuration(500).start();
                    mejoras.animate().x(580).setDuration(500).start();
                    movimientoMejora = false;
                }


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