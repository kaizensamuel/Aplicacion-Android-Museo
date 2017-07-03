package com.example.tati.appmuseo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xana-.0 on 01/07/2017.
 */

public class AdaptadorListView extends BaseAdapter{
    Context c;
    List<DatosListView> datos;

    public AdaptadorListView(Context c, List<DatosListView> datos) {
        this.c = c;
        this.datos = datos;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return datos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista;


        if (convertView == null) //NO existe, creamos uno
            vista = new View(parent.getContext());
        else                    //Existe, reutilizamos
            vista = convertView;

        LayoutInflater inf=LayoutInflater.from(c);
        vista=inf.inflate(R.layout.item_listview,null);
        ImageView im=(ImageView)vista.findViewById(R.id.img_cuadro);
        TextView t1=(TextView)vista.findViewById(R.id.nombre_cuadro);
        TextView t2=(TextView)vista.findViewById(R.id.nombre_autor_cuadro);

        im.setImageResource(datos.get(position).getImagen()); //datos.get(position).getImagen();

        t1.setText(datos.get(position).getNmbreCuadro());
        t2.setText(datos.get(position).getNombreAutor());
        return vista;
    }
}
