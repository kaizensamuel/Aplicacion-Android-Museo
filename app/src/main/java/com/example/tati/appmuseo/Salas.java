package com.example.tati.appmuseo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Salas extends AppCompatActivity implements View.OnClickListener{

    Dialogo dialog;
    FragmentManager fm;
    ArrayList<DatosListView> dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salas);
        dato=new ArrayList();
        nombreAppBar();
        verSala();
        callSalir();
        dato.add(new DatosListView("Baco","Caravaggio",R.drawable.baco,0));
        dato.add(new DatosListView("Crucifixion San Pedro","Caravaggio",R.drawable.crucifixion_san_pedro,1));
        dato.add(new DatosListView("Entierro de ornans"," Gustave Courbet",R.drawable.entierro_en_ornans,2));
    }

    public void nombreAppBar(){
        final TextView titulo_app_bar = (TextView) findViewById(R.id.titulo_app_bar);
        titulo_app_bar.setText("Mapa");
    }

    public void verSala(){
        CardView s1 = (CardView) findViewById(R.id.sala1);
        s1.setOnClickListener(this);

        CardView s2 = (CardView) findViewById(R.id.sala2);
        s2.setOnClickListener(this);

        CardView s3 = (CardView) findViewById(R.id.sala3);
        s3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String lista="";
        dialog = new Dialogo();
        fm = getSupportFragmentManager();

        // Para que se cargen los datos en el dialogo correspondiente
        Dialogo.opcion = 3;
        Intent intent = new Intent(v.getContext(), listviewcuadros.class);



        lista = "Sala 2";
        switch (v.getId()){
            case R.id.sala1:
                intent.putExtra("sala",1);
                break;
            case R.id.sala2:
                intent.putExtra("sala",2);
                break;
            case R.id.sala3:
                intent.putExtra("sala",3);
                break;
        }


        startActivityForResult(intent,0);
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
}
