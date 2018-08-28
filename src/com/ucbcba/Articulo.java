package com.ucbcba;

import java.util.ArrayList;
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

    public boolean isPalabra(String palabra){
        /*
        String caracteres  = "abcdefghijklmnopqrs";
        for(int i=0; i < palabra.length(); i++){
            if(caracteres.contains(String.valueOf(palabra.charAt(i)))){
                return true;
            }
        }
        return false;*/
        return palabra.matches("(a-zA-Z)");
    }

    public int numeroPalabras(){
        String[] arreglo = this.texto.split(" ");
        int contador = 0;
        for(String palabra : arreglo){
            if(isPalabra(palabra)){
                contador++;
            }
        }
        return contador;
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

    public void anadirComentario(Comentario comentario) throws ComentarioVacioException, ComentarioLengthException {
        if(comentario.getTexto().equals("")){
            throw  new ComentarioVacioException();
        }
        if(comentario.getTexto().length() <= 5){
            throw  new ComentarioLengthException(comentario.getTexto().length());
        }
        this.comentarios.add(comentario);

    }

    public void borrarComentario(Integer id){
        this.comentarios.remove(id);
    }

}
