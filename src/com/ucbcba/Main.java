package com.ucbcba;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Blog blog = new Blog("miblog.com", "Mi Blog");
        Articulo articulo1 = new Articulo("texto del articulo");
        articulo1.anadirComentario(new Comentario("Comentario"));
        articulo1.like();
        blog.anadirArticulo(articulo1);
        blog.anadirArticulo(new Articulo("Otro texto"));
        blog.borrarArticulo(1);
    }
}
