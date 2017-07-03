package com.example.tati.appmuseo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cuadros extends AppCompatActivity implements View.OnClickListener {

    Dialogo dialog;
    FragmentManager fm;
    ArrayList<String> ld,lf,lc;
    ArrayList<Integer>   li;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadros);

        inicializar();
        setValoresCardView_Cuadros();
        nombreAppBar();
        callSalir();
    }

    public void inicializar() {

        dialog = new Dialogo();
        fm = getSupportFragmentManager();

        CardView c1 = (CardView) findViewById(R.id.cuadro1);
        CardView c2 = (CardView) findViewById(R.id.cuadro2);
        CardView c3 = (CardView) findViewById(R.id.cuadro3);
        CardView c4 = (CardView) findViewById(R.id.cuadro4);
        CardView c5 = (CardView) findViewById(R.id.cuadro5);
        CardView c6 = (CardView) findViewById(R.id.cuadro6);
        CardView c7 = (CardView) findViewById(R.id.cuadro7);
        CardView c8 = (CardView) findViewById(R.id.cuadro8);
        CardView c9 = (CardView) findViewById(R.id.cuadro9);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
    }

    public void nombreAppBar() {
        final TextView titulo_app_bar = (TextView) findViewById(R.id.titulo_app_bar);
        titulo_app_bar.setText("Lista de cuadros");
    }

    // Esta función devuelve un array con los nombres de los cuadros
    public ArrayList<String> getListaCuadros() {
        lc = new ArrayList<String>();

        lc.add(getString(R.string.nc1));
        lc.add(getString(R.string.nc2));
        lc.add(getString(R.string.nc3));
        lc.add(getString(R.string.nc4));
        lc.add(getString(R.string.nc5));
        lc.add(getString(R.string.nc6));
        lc.add(getString(R.string.nc7));
        lc.add(getString(R.string.nc8));
        lc.add(getString(R.string.nc9));

        return lc;
    }

    // Esta función devuelve un array con los nombres de las fechas de los cuadros
    public ArrayList<String> getListaFechas() {
         lf = new ArrayList<String>();

        lf.add(getString(R.string.fc1));
        lf.add(getString(R.string.fc2));
        lf.add(getString(R.string.fc3));
        lf.add(getString(R.string.fc4));
        lf.add(getString(R.string.fc5));
        lf.add(getString(R.string.fc6));
        lf.add(getString(R.string.fc7));
        lf.add(getString(R.string.fc8));
        lf.add(getString(R.string.fc9));

        return lf;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //outState.putInt("estado", 1);
/*
        outState.putString("Nombre", lc.get(c));
        outState.putString("Descripcion", ld.get(c));
        outState.putInt("imagen", li.get(c));
        outState.putString("fecha", lc.get(c));
        outState.putInt("opcion", 2);;*/

    }
    @Override
    protected void onRestoreInstanceState(Bundle recEstado) {
        super.onRestoreInstanceState(recEstado);


    }




    // Esta función devuelve un array con las descripciones de los cuadros
    public ArrayList<String> getListaDescripcion(){
        ld = new ArrayList<String>();

        ld.add(getString(R.string.dc1));
        ld.add(getString(R.string.dc2));
        ld.add(getString(R.string.dc3));
        ld.add(getString(R.string.dc4));
        ld.add(getString(R.string.dc5));
        ld.add(getString(R.string.dc6));
        ld.add(getString(R.string.dc7));
        ld.add(getString(R.string.dc8));
        ld.add(getString(R.string.dc9));

        return ld;
    }

    // Esta función devuelve un array con las descripciones de los cuadros
    public ArrayList<Integer> getListaDeImagenes(){
         li = new ArrayList();

        li.add(R.drawable.gioconda);
        li.add(R.drawable.la_ultima_cena);
        li.add(R.drawable.la_virgen_de_las_rocas);
        li.add(R.drawable.la_sagrada_familia);
        li.add(R.drawable.retrato_de_cardenal);
        li.add(R.drawable.madonna_sixtina);
        li.add(R.drawable.venus_de_urbino);
        li.add(R.drawable.flora);
        li.add(R.drawable.las_meninas);

        return li;
    }

    // Esta función rellena los valores de los CardView del activity_cuadros.xml
    public void setValoresCardView_Cuadros(){

        // Fotos de cuadros
        ImageView c1 = (ImageView) findViewById(R.id.foto_c1);
        ImageView c2 = (ImageView) findViewById(R.id.foto_c2);
        ImageView c3 = (ImageView) findViewById(R.id.foto_c3);
        ImageView c4 = (ImageView) findViewById(R.id.foto_c4);
        ImageView c5 = (ImageView) findViewById(R.id.foto_c5);
        ImageView c6 = (ImageView) findViewById(R.id.foto_c6);
        ImageView c7 = (ImageView) findViewById(R.id.foto_c7);
        ImageView c8 = (ImageView) findViewById(R.id.foto_c8);
        ImageView c9 = (ImageView) findViewById(R.id.foto_c9);

        c1.setImageResource(R.drawable.gioconda);
        c2.setImageResource(R.drawable.la_ultima_cena);
        c3.setImageResource(R.drawable.la_virgen_de_las_rocas);
        c4.setImageResource(R.drawable.la_sagrada_familia);
        c5.setImageResource(R.drawable.retrato_de_cardenal);
        c6.setImageResource(R.drawable.madonna_sixtina);
        c7.setImageResource(R.drawable.venus_de_urbino);
        c8.setImageResource(R.drawable.flora);
        c9.setImageResource(R.drawable.las_meninas);

        // Nombres
        TextView n1 = (TextView) findViewById(R.id.nombre_c1);
        TextView n2 = (TextView) findViewById(R.id.nombre_c2);
        TextView n3 = (TextView) findViewById(R.id.nombre_c3);
        TextView n4 = (TextView) findViewById(R.id.nombre_c4);
        TextView n5 = (TextView) findViewById(R.id.nombre_c5);
        TextView n6 = (TextView) findViewById(R.id.nombre_c6);
        TextView n7 = (TextView) findViewById(R.id.nombre_c7);
        TextView n8 = (TextView) findViewById(R.id.nombre_c8);
        TextView n9 = (TextView) findViewById(R.id.nombre_c9);

        n1.setText(R.string.nc1);
        n2.setText(R.string.nc2);
        n3.setText(R.string.nc3);
        n4.setText(R.string.nc4);
        n5.setText(R.string.nc5);
        n6.setText(R.string.nc6);
        n7.setText(R.string.nc7);
        n8.setText(R.string.nc8);
        n9.setText(R.string.nc9);

        // Fechas
        TextView f1 = (TextView) findViewById(R.id.fecha_c1);
        TextView f2 = (TextView) findViewById(R.id.fecha_c2);
        TextView f3 = (TextView) findViewById(R.id.fecha_c3);
        TextView f4 = (TextView) findViewById(R.id.fecha_c4);
        TextView f5 = (TextView) findViewById(R.id.fecha_c5);
        TextView f6 = (TextView) findViewById(R.id.fecha_c6);
        TextView f7 = (TextView) findViewById(R.id.fecha_c7);
        TextView f8 = (TextView) findViewById(R.id.fecha_c8);
        TextView f9 = (TextView) findViewById(R.id.fecha_c9);

        f1.setText(R.string.fc1);
        f2.setText(R.string.fc2);
        f3.setText(R.string.fc3);
        f4.setText(R.string.fc4);
        f5.setText(R.string.fc5);
        f6.setText(R.string.fc6);
        f7.setText(R.string.fc7);
        f8.setText(R.string.fc8);
        f9.setText(R.string.fc9);

    }

    @Override
    public void onClick(View v) {

        ArrayList<String> la = getListaCuadros();
        ArrayList<String> lf = getListaFechas();
        ArrayList<String> ld = getListaDescripcion();
        ArrayList<Integer> li = getListaDeImagenes();

        // Para que se cargen los datos en el dialogo correspondiente
        Dialogo.opcion = 2;
        Intent intent = new Intent(v.getContext(), Detalle.class);
        switch (v.getId()){
            case R.id.cuadro1:
                // Mostrar dialogo con la info del cuadro
                c=0;
                Detalle.setInfo(la.get(0), lf.get(0), ld.get(0), li.get(0));


                break;
            case R.id.cuadro2:
                // Mostrar dialogo con la info del cuadro
                c=1;
                Detalle.setInfo(la.get(1), lf.get(1), ld.get(1), li.get(1));

                break;
            case R.id.cuadro3:
                // Mostrar dialogo con la info del cuadro
                c=2;
                Detalle.setInfo(la.get(2), lf.get(2), ld.get(2), li.get(2));
                break;
            case R.id.cuadro4:
                // Mostrar dialogo con la info del cuadro
                c=3;
                Detalle.setInfo(la.get(3), lf.get(3), ld.get(3), li.get(3));
                break;
            case R.id.cuadro5:
                // Mostrar dialogo con la info del cuadro
                c=4;
                Detalle.setInfo(la.get(4), lf.get(4), ld.get(4), li.get(4));

                break;
            case R.id.cuadro6:
                // Mostrar dialogo con la info del cuadro
                c=5;
                Detalle.setInfo(la.get(5), lf.get(5), ld.get(5), li.get(5));

                break;
            case R.id.cuadro7:
                // Mostrar dialogo con la info del cuadro
                c=6;Detalle.setInfo(la.get(6), lf.get(6), ld.get(6), li.get(6));

                break;
            case R.id.cuadro8:
                // Mostrar dialogo con la info del cuadro
                c=7; Detalle.setInfo(la.get(7), lf.get(7), ld.get(7), li.get(7));

                break;
            case R.id.cuadro9:
                c=8; Detalle.setInfo(la.get(8), lf.get(8), ld.get(8), li.get(8));
                // Mostrar dialogo con la info del cuadro

                break;
        }startActivityForResult(intent,0);
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
