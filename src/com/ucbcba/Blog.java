package com.ucbcba;

import java.util.List;

public class Blog extends SitioWeb {

    private List<Articulo> articulos;

    public Blog(String url, String nombre) {
        super(url, nombre);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int numeroArticulos(){
        return articulos.size();
    }
    public int numeroComentarios(){
        int numeroComentarios = 0;
        for(Articulo articulo : this.articulos){
            numeroComentarios += articulo.numeroComentarios();
        }
        return numeroComentarios;//TODO
    }

    public int numeroPalabras(){
        return 0;//TODO
    }
    public void mostrarArticulos(){
        //TODO
    }

    public void anadirArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public void borrarArticulo(Integer id){
        this.articulos.remove(id);
    }
}
