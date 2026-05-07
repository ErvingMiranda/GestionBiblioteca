package org.Ezone.POO.Models;

public class Libro extends Material {
    private String autor;

    public Libro(String codigo, String titulo, Integer anioPublicacion, String autor) {
        super(codigo, titulo, anioPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro");
        System.out.println("--------");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Año de publicación: " + this.getAnioPublicacion());
        System.out.println("Autor: " + this.getAutor());
    }
}


