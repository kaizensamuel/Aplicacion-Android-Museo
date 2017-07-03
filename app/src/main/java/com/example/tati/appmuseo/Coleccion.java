package com.example.tati.appmuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Coleccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleccion);

        nombreAppBar();
        verAutores();
        verEstilos();
        verCuadros();

        callSalir();
    }

    public void nombreAppBar(){
        final TextView titulo_app_bar = (TextView) findViewById(R.id.titulo_app_bar);
        titulo_app_bar.setText("Colección");
    }

    public void callSalir(){

        // Localizamos el botón en la vista
        final ImageButton salir = (ImageButton) findViewById(R.id.boton_atras);

        // Creamos el Listener
        salir.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

    public void verAutores(){

        // Localizamos el botón en la vista
        final CardView autores = (CardView) findViewById(R.id.autores);

        // Creamos el Listener
        autores.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Autores.class);
                startActivityForResult(intent,0);
            }
        });
    }

    public void verEstilos(){

        // Localizamos el botón en la vista
        final CardView estilos = (CardView) findViewById(R.id.estilos);

        // Creamos el Listener
        estilos.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Estilos.class);
                startActivityForResult(intent,0);
            }
        });
    }

    public void verCuadros(){

        // Localizamos el botón en la vista
        final CardView cuadros = (CardView) findViewById(R.id.cuadros);

        // Creamos el Listener
        cuadros.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), Cuadros.class);
                startActivityForResult(intent,0);
            }
        });
    }

}
