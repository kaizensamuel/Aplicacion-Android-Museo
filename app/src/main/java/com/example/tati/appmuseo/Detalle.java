package com.example.tati.appmuseo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    TextView name, date, description;
    public static String nombre, fecha, descripcion;
    public static int foto;
    ImageView photo;

    // Para saber qué diálogo tengo que lanzar
    public static int opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        name = (TextView) findViewById(R.id.nombre);
        date = (TextView) findViewById(R.id.fecha);
        description = (TextView) findViewById(R.id.descripcion);
        photo = (ImageView) findViewById(R.id.foto);

        switch (opcion){
            case 0:
                cargarAutores();
                break;
            case 1:
                cargarEstilos();
                break;
            case 2:
                cargarCuadros();
                break;
            case 3:
                cargarSalas();
                break;
        }
        callSalir();

    }

    public void cargarSalas(){

        name.setText(nombre);
        description.setText(descripcion);
        photo.setVisibility(View.GONE);
        date.setVisibility(View.GONE);


    }
    public void cargarCuadros(){

        name.setText(nombre);
        date.setText(fecha);
        description.setText(descripcion);
        photo.setImageResource(foto);

    }

    public void cargarAutores(){
        name.setText(nombre);
        date.setText(fecha);

        description.setText(descripcion);
        photo.setImageResource(foto);

    }

    public void cargarEstilos(){
        name.setText(nombre);
        date.setVisibility(View.GONE);
        photo.setImageResource(foto);

        description.setText(descripcion);

    }

    public static void setInfo(String n, String f, String d, int imagen){
        nombre = n;
        fecha = f;
        descripcion = d;
        foto = imagen;

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
