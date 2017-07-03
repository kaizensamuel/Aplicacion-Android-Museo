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

import java.util.ArrayList;

public class Autores extends AppCompatActivity implements View.OnClickListener {

    Dialogo dialog;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autores);

        inicializar();
        setValoresCardView_Autores();
        nombreAppBar();
        callSalir();
    }

    public void inicializar(){

        dialog = new Dialogo();
        fm = getSupportFragmentManager();

        CardView a1 = (CardView) findViewById(R.id.autor1);
        CardView a2 = (CardView) findViewById(R.id.autor2);
        CardView a4 = (CardView) findViewById(R.id.autor4);
        CardView a5 = (CardView) findViewById(R.id.autor5);
        CardView a6 = (CardView) findViewById(R.id.autor6);
        CardView a7 = (CardView) findViewById(R.id.autor7);
        CardView a8 = (CardView) findViewById(R.id.autor8);
        CardView a9 = (CardView) findViewById(R.id.autor9);
        CardView a3 = (CardView) findViewById(R.id.autor3);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
    }

    public void nombreAppBar(){
        final TextView titulo_app_bar = (TextView) findViewById(R.id.titulo_app_bar);
        titulo_app_bar.setText("Autores");
    }

    // Esta función devuelve un array con los nombres de los autores
    public ArrayList<String> getListaAutores(){
        ArrayList<String> la = new ArrayList<String>();

        la.add(getString(R.string.autor1));
        la.add(getString(R.string.autor2));
        la.add(getString(R.string.autor3));
        la.add(getString(R.string.autor4));
        la.add(getString(R.string.autor5));
        la.add(getString(R.string.autor6));
        la.add(getString(R.string.autor7));
        la.add(getString(R.string.autor8));
        la.add(getString(R.string.autor9));

        return la;
    }

    // Esta función devuelve un array con los nombres de las fechas de los autores
    public ArrayList<String> getListaFechas(){
        ArrayList<String> lf = new ArrayList<String>();

        lf.add(getString(R.string.fecha1));
        lf.add(getString(R.string.fecha2));
        lf.add(getString(R.string.fecha3));
        lf.add(getString(R.string.fecha4));
        lf.add(getString(R.string.fecha5));
        lf.add(getString(R.string.fecha6));
        lf.add(getString(R.string.fecha7));
        lf.add(getString(R.string.fecha8));
        lf.add(getString(R.string.fecha9));

        return lf;
    }

    // Esta función devuelve un array con las descripciones de los autores
    public ArrayList<String> getListaDescripcion(){
        ArrayList<String> ld = new ArrayList<String>();

        ld.add(getString(R.string.autor1_desc));
        ld.add(getString(R.string.autor2_desc));
        ld.add(getString(R.string.autor3_desc));
        ld.add(getString(R.string.autor4_desc));
        ld.add(getString(R.string.autor5_desc));
        ld.add(getString(R.string.autor6_desc));
        ld.add(getString(R.string.autor7_desc));
        ld.add(getString(R.string.autor8_desc));
        ld.add(getString(R.string.autor9_desc));

        return ld;
    }

    // Esta función devuelve un array con las descripciones de los autores
    public ArrayList<Integer> getListaDeImagenes(){
        ArrayList<Integer> li = new ArrayList();

        li.add(R.drawable.da_vinci);
        li.add(R.drawable.miguel_angel);
        li.add(R.drawable.rafael_sanzio);
        li.add(R.drawable.tiziano);
        li.add(R.drawable.velazquez);
        li.add(R.drawable.caravaggio);
        li.add(R.drawable.ribera);
        li.add(R.drawable.courbet);
        li.add(R.drawable.salvador_dali);

        return li;
    }

    // Esta función rellena los valores de los CardView del activity_autores.xml
    public void setValoresCardView_Autores(){

        // Autor 1
        ImageView a1 = (ImageView) findViewById(R.id.a1);
        a1.setImageResource(R.drawable.da_vinci);
        TextView n1 = (TextView) findViewById(R.id.n1);
        n1.setText(R.string.autor1);
        TextView f1 = (TextView) findViewById(R.id.fecha1);
        f1.setText(R.string.fecha1);

        // Autor 2
        ImageView a2 = (ImageView) findViewById(R.id.a2);
        a2.setImageResource(R.drawable.miguel_angel);
        TextView n2 = (TextView) findViewById(R.id.n2);
        n2.setText(R.string.autor2);
        TextView f2 = (TextView) findViewById(R.id.fecha2);
        f2.setText(R.string.fecha2);

        // Autor 3
        ImageView a3 = (ImageView) findViewById(R.id.a3);
        a3.setImageResource(R.drawable.rafael_sanzio);
        TextView n3 = (TextView) findViewById(R.id.n3);
        n3.setText(R.string.autor3);
        TextView f3 = (TextView) findViewById(R.id.fecha3);
        f3.setText(R.string.fecha3);

        // Autor 4
        ImageView a4 = (ImageView) findViewById(R.id.a4);
        a4.setImageResource(R.drawable.tiziano);
        TextView n4 = (TextView) findViewById(R.id.n4);
        n4.setText(R.string.autor4);
        TextView f4 = (TextView) findViewById(R.id.fecha4);
        f4.setText(R.string.fecha4);

        // Autor 5
        ImageView a5 = (ImageView) findViewById(R.id.a5);
        a5.setImageResource(R.drawable.velazquez);
        TextView n5 = (TextView) findViewById(R.id.n5);
        n5.setText(R.string.autor5);
        TextView f5 = (TextView) findViewById(R.id.fecha5);
        f5.setText(R.string.fecha5);

        // Autor 6
        ImageView a6 = (ImageView) findViewById(R.id.a6);
        a6.setImageResource(R.drawable.caravaggio);
        TextView n6 = (TextView) findViewById(R.id.n6);
        n6.setText(R.string.autor6);
        TextView f6 = (TextView) findViewById(R.id.fecha6);
        f6.setText(R.string.fecha6);

        // Autor 7
        ImageView a7 = (ImageView) findViewById(R.id.a7);
        a7.setImageResource(R.drawable.ribera);
        TextView n7 = (TextView) findViewById(R.id.n7);
        n7.setText(R.string.autor7);
        TextView f7 = (TextView) findViewById(R.id.fecha7);
        f7.setText(R.string.fecha7);

        // Autor 8
        ImageView a8 = (ImageView) findViewById(R.id.a8);
        a8.setImageResource(R.drawable.courbet);
        TextView n8 = (TextView) findViewById(R.id.n8);
        n8.setText(R.string.autor8);
        TextView f8 = (TextView) findViewById(R.id.fecha8);
        f8.setText(R.string.fecha8);

        // Autor 9
        ImageView a9 = (ImageView) findViewById(R.id.a9);
        a9.setImageResource(R.drawable.salvador_dali);
        TextView n9 = (TextView) findViewById(R.id.n9);
        n9.setText(R.string.autor9);
        TextView f9 = (TextView) findViewById(R.id.fecha9);
        f9.setText(R.string.fecha9);
    }

    @Override
    public void onClick(View v) {

        ArrayList<String> la = getListaAutores();
        ArrayList<String> lf = getListaFechas();
        ArrayList<String> ld = getListaDescripcion();
        ArrayList<Integer> li = getListaDeImagenes();

        // Para que se cargen los datos en el dialogo correspondiente
        Detalle.opcion = 0;
        Intent intent = new Intent(v.getContext(), Detalle.class);
        switch (v.getId()){
            case R.id.autor1:
                // Mostrar la info del autor
                Detalle.setInfo(la.get(0), lf.get(0), ld.get(0), li.get(0));
               break;
            case R.id.autor2:
                // Mostrar dialogo con la info del autor

                Detalle.setInfo(la.get(1), lf.get(1), ld.get(1), li.get(1));

                break;
            case R.id.autor3:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(2), lf.get(2), ld.get(2), li.get(2));

                break;
            case R.id.autor4:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(3), lf.get(3), ld.get(3), li.get(3));

                break;
            case R.id.autor5:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(4), lf.get(4), ld.get(4), li.get(4));

                break;
            case R.id.autor6:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(4), lf.get(4), ld.get(4), li.get(4));

                break;
            case R.id.autor7:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(5), lf.get(5), ld.get(5), li.get(5));

                break;
            case R.id.autor8:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(6), lf.get(6), ld.get(6), li.get(6));


                break;
            case R.id.autor9:
                // Mostrar dialogo con la info del autor
                Detalle.setInfo(la.get(7), lf.get(7), ld.get(7), li.get(7));


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
