package com.stefany.literalura.model;

import java.util.List;

public class Livro {
    private String titulo;
    private Integer numeroDownloads;
    private List<String> idioma;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(Integer numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "******Livro*******" +
                "Titulo: " + titulo + "\n"+
                "NumeroDownloads: " + numeroDownloads +"\n"+
                "Idioma: " + idioma +"\n"+
                "Autor: " + autor +"\n"+
                "*****************";
    }
}
