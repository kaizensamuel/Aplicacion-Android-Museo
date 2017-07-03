package com.example.tati.appmuseo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dialogo extends DialogFragment{

    public static TextView name, date, description;
    public static String nombre, fecha, descripcion;
    public static int foto;
    ImageView photo;

    // Para saber qué diálogo tengo que lanzar
    public static int opcion;

    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){

        // Creamos el cuadro de dialogo y se situa encima del activity
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Metemos el contenido que queremos ver en el dialogo
        final View v = inflater.inflate(R.layout.activity_dialogo, null);
        name = (TextView) v.findViewById(R.id.nombre);
        date = (TextView) v.findViewById(R.id.fecha);
        description = (TextView) v.findViewById(R.id.descripcion);
        photo = (ImageView) v.findViewById(R.id.foto);

        // Asignamos el btón OK al dialogo
        builder.setView(v).setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                });

        final Dialog dialog = builder.create();

        switch (opcion){
            case 0:
                cargarAutores(dialog,v);
                break;
            case 1:
                cargarEstilos(dialog,v);
                break;
            case 2:
                cargarCuadros(dialog,v);
                break;
            case 3:
                cargarSalas(dialog,v);
                break;
        }

        return dialog;
    }

    public void cargarAutores(Dialog dialog, final View v){

        name = (TextView) v.findViewById(R.id.nombre);
        date = (TextView) v.findViewById(R.id.fecha);
        description = (TextView) v.findViewById(R.id.descripcion);
        photo= (ImageView) v.findViewById(R.id.foto);

        name.setText(nombre);
        date.setText(fecha);
        description.setText(descripcion);
        photo.setImageResource(foto);



    }

    public void cargarEstilos(Dialog dialog, final View v){


                name = (TextView) v.findViewById(R.id.nombre);
                date = (TextView) v.findViewById(R.id.fecha);
                photo = (ImageView) v.findViewById(R.id.foto);
                description = (TextView) v.findViewById(R.id.descripcion);

                name.setText(nombre);
                date.setVisibility(View.GONE);
                photo.setImageResource(foto);
                description.setText(descripcion);

    }
   /* @Override
    protected void onRestoreInstanceState(Bundle recEstado) {
        super.onRestoreInstanceState(recEstado);

        Dialogo.opcion = recEstado.getInt("opcion");
        dialog.setInfoCuadro(recEstado.getString("Nombre"), recEstado.getString("fecha"),
                recEstado.getString("Descripcion"),recEstado.getInt("imagen") );
        // dialog.show(fm,"restaurado ");

        ///   var = recEstado.getString("variable");
        ///pos = recEstado.getInt("posicion");
    }
*/
    public static void carga(){

    }

    public void cargarCuadros(Dialog dialog, final View v){

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {



                name.setText(nombre);
                date.setText(fecha);
                description.setText(descripcion);
                photo.setImageResource(foto);
            }
        });
    }

    public void cargarSalas(Dialog dialog, final View v){

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {

                name = (TextView) v.findViewById(R.id.nombre);
                description = (TextView) v.findViewById(R.id.descripcion);

                name.setText(nombre);
                description.setText(descripcion);

                date = (TextView) v.findViewById(R.id.fecha);
                date.setVisibility(View.GONE);
                photo = (ImageView) v.findViewById(R.id.foto);
                photo.setVisibility(View.GONE);
            }
        });
    }


}