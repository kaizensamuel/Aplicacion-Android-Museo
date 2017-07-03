package com.example.tati.appmuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        coleccion();
        salas();
        salir();
    }

    public void salas(){

        // Localizamos el botón en la vista
        final CardView salas = (CardView) findViewById(R.id.salas);

        // Creamos el Listener
        salas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Salas.class);
                startActivityForResult(intent,0);
            }
        });
    }

    public void coleccion(){

        // Localizamos el botón en la vista
        final CardView coleccion = (CardView) findViewById(R.id.coleccion);

        // Creamos el Listener
        coleccion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Coleccion.class);
                startActivityForResult(intent,0);
            }
        });
    }

    public void salir(){

        // Localizamos el botón en la vista
        final CardView salir = (CardView) findViewById(R.id.salir);

        // Creamos el Listener
        salir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
