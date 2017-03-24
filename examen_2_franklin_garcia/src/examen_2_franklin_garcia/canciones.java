/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2_franklin_garcia;

/**
 *
 * @author Franklin Garcia
 */
public class canciones {
    // Las canciones poseen Nombre, artista, duración (en segundos), genero.
    private String nombre;
    private String artista;
    private double duracion;
    private String Genero;

    public canciones() {
    }

    public canciones(String nombre, String artista, double duracion, String Genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.Genero = Genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
}
