package com.ucbcba;

import java.util.List;

public class Articulo {

    private String texto;
    private int likes;
    private List<Comentario> comentarios;

    public Articulo(){
        this.likes = 0;
    }
    public Articulo(String texto){
        this.likes = 0;
        this.texto = texto;
    }

    public int numeroComentarios(){
        return this.comentarios.size();
    }

    public int numeroPalabras(){
        return 0; //TODO
    }

    public void like(){
        this.likes++;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void anadirComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

    public void borrarComentario(Integer id){
        this.comentarios.remove(id);
    }

}
