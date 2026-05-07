package org.Ezone.POO.Models;

public class Revista extends Material {
    private String NumeroEdicion;

    public Revista(String codigo, String titulo, Integer anioPublicacion, String numeroEdicion) {
        super(codigo, titulo, anioPublicacion);
        NumeroEdicion = numeroEdicion;
    }

    public String getNumeroEdicion() {
        return NumeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        NumeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista");
        System.out.println("---------");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Año de publicación: " + this.getAnioPublicacion());
        System.out.println("Número de edición: " + this.getNumeroEdicion());
    }
}
