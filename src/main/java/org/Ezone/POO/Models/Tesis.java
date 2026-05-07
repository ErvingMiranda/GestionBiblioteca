package org.Ezone.POO.Models;

public class Tesis extends Material{
    private String universidad;

    public Tesis(String codigo, String titulo, Integer anioPublicacion, String universidad) {
        super(codigo, titulo, anioPublicacion);
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Tesis");
        System.out.println("--------");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Año de publicación: " + this.getAnioPublicacion());
        System.out.println("Universidad de origen: " + this.universidad);
    }
}
