package com.ucbcba;

public class SitioWeb {
    private String url;
    private String nombre;

    public SitioWeb(String url, String nombre){
        this.url = url;
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
