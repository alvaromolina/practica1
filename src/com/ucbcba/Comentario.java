package com.ucbcba;

public class Comentario {
    private String texto;
    private int likes;

    public Comentario(){
        this.likes = 0;
    }
    public Comentario(String texto){
        this.likes = 0;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int numeroPalabras(){
        return 0; //TODO
    }

    public void like(){
        this.likes++;
    }

}
