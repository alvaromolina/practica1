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
}
