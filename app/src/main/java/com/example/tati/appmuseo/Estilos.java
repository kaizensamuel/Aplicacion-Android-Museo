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

public class Estilos extends AppCompatActivity implements View.OnClickListener{

    Dialogo dialog;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilos);

        dialog = new Dialogo();
        fm = getSupportFragmentManager();

        CardView e1 = (CardView) findViewById(R.id.estilo1);
        CardView e2 = (CardView) findViewById(R.id.estilo2);
        CardView e3 = (CardView) findViewById(R.id.estilo3);

        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
        e3.setOnClickListener(this);

        setValoresCardView_Estilos();
        nombreAppBar();
        callSalir();
    }

    public void nombreAppBar(){
        final TextView titulo_app_bar = (TextView) findViewById(R.id.titulo_app_bar);
        titulo_app_bar.setText("Estilos");
    }

    // Esta función devuelve un array con los nombres de los estilos
    public ArrayList<String> getListaEstilos(){
        ArrayList<String> le = new ArrayList<String>();

        le.add(getString(R.string.estilo1));
        le.add(getString(R.string.estilo2));
        le.add(getString(R.string.estilo3));

        return le;
    }

    // Esta función devuelve un array con las imagenes de los estilos
    public ArrayList<Integer> getListaImagenesEstilos(){
        ArrayList<Integer> li = new ArrayList<Integer>();

        li.add(R.drawable.gioconda);
        li.add(R.drawable.autorretrato);
        li.add(R.drawable.las_meninas);

        return li;
    }

    public ArrayList<String> getListaDescripcion(){
        ArrayList<String> ld = new ArrayList<String>();

        ld.add(getString(R.string.estilo1_desc));
        ld.add(getString(R.string.estilo2_desc));
        ld.add(getString(R.string.estilo3_desc));

        return ld;
    }

    // Esta función rellena los valores de los CardView del activity_estilos.xml
    public void setValoresCardView_Estilos(){

        // Estilo 1
        ImageView a1 = (ImageView) findViewById(R.id.img_e1);
        a1.setImageResource(R.drawable.gioconda);
        TextView n1 = (TextView) findViewById(R.id.ne1);
        n1.setText(R.string.estilo1);

        // Estilo 2
        ImageView a2 = (ImageView) findViewById(R.id.img_e2);
        a2.setImageResource(R.drawable.autorretrato);
        TextView n2 = (TextView) findViewById(R.id.ne2);
        n2.setText(R.string.estilo2);

        // Estilo 3
        ImageView a3 = (ImageView) findViewById(R.id.img_e3);
        a3.setImageResource(R.drawable.las_meninas);
        TextView n3 = (TextView) findViewById(R.id.ne3);
        n3.setText(R.string.estilo3);
    }

    @Override
    public void onClick(View v) {

        ArrayList<String> le = getListaEstilos();
        ArrayList<Integer> li = getListaImagenesEstilos();
        ArrayList<String> ld = getListaDescripcion();

        // Para que se cargen los datos en el dialogo correspondiente
        Dialogo.opcion = 1;
        Intent intent = new Intent(v.getContext(), Detalle.class);

        switch (v.getId()){
            case R.id.estilo1:

                Detalle.setInfo(le.get(0), "", ld.get(0), li.get(0));
                break;
            case R.id.estilo2:

                Detalle.setInfo(le.get(1), "", ld.get(1), li.get(1));
                break;
            case R.id.estilo3:

                Detalle.setInfo(le.get(2), "", ld.get(2), li.get(2));

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
