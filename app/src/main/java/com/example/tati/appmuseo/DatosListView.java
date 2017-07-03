package com.example.tati.appmuseo;

/**
 * Created by xana-.0 on 01/07/2017.
 */

public class DatosListView {
    String nmbreCuadro,nombreAutor;
    int imagen,Id;


    public DatosListView(String nmbreCuadro, String nombreAutor, int imagen,int Id) {
        this.nmbreCuadro = nmbreCuadro;
        this.nombreAutor = nombreAutor;
        this.imagen = imagen;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNmbreCuadro() {
        return nmbreCuadro;
    }

    public void setNmbreCuadro(String nmbreCuadro) {
        this.nmbreCuadro = nmbreCuadro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
