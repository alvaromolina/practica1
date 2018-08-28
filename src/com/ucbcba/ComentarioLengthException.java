package com.ucbcba;

public class ComentarioLengthException extends Exception {
    int length;

    public ComentarioLengthException(){
        super();
    }
    public ComentarioLengthException(int length){
        this.length = length;
    }

    @Override
    public String getMessage() {
        return "El comentario tiene un tamaño invalido de"+length;
    }
}
