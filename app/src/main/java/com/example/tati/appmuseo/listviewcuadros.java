package com.example.tati.appmuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listviewcuadros extends AppCompatActivity {

    public static ListView lD;
    public TextView t;
    public static ArrayList<DatosListView> ldatos;
    public static String sala;
    int salaN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_cuadros);
        t=(TextView)findViewById(R.id.titulo_app_bar);

        ldatos=new ArrayList();

        Intent i=getIntent();
        salaN=i.getIntExtra("sala",-1);

        switch (salaN){
            case 1:
                t.setText("Sala 1");
                sala1();
                break;
            case 2:
                t.setText("Sala 2");
                sala2();
                break;
            case 3:
                t.setText("Sala 3");
                sala3();
                break;
        }
        lD=(ListView)findViewById(R.id.lista);
        callSalir();
       AdaptadorListView mAd=new AdaptadorListView(this,ldatos);
         lD.setAdapter(mAd);

    }
    public void sala1(){
        ldatos.add(new DatosListView("Baco","Velázquez",R.drawable.baco,0));
        ldatos.add(new DatosListView("Crucifixion San Pedro","Caravaggio",R.drawable.crucifixion_san_pedro,1));
        ldatos.add(new DatosListView("Entierro de Ornans","Gustave Courbet",R.drawable.entierro_en_ornans,2));
    }
    public void sala2(){
        ldatos.add(new DatosListView("Flora","Tiziano",R.drawable.flora,0));
        ldatos.add(new DatosListView("La Gioconda ","Leonardo Da Vinci",R.drawable.gioconda,1));
        ldatos.add(new DatosListView("La sagrada familia","Goya",R.drawable.la_sagrada_familia,2));
    }
    public void sala3(){
        ldatos.add(new DatosListView("Las Meninas","Velázquez",R.drawable.las_meninas,0));
        ldatos.add(new DatosListView("Retrato de Cardenal","Rafael",R.drawable.retrato_de_cardenal,1));
        ldatos.add(new DatosListView("La Última Cena","Leonardo Da Vinci",R.drawable.la_ultima_cena,2));
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
