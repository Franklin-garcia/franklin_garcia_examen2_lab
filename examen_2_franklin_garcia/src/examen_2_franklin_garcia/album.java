/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2_franklin_garcia;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class album {
    private String nombre;
    private String artista;
    private ArrayList<canciones>lista_canciones=new ArrayList();

    public album() {
    }

    public album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
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

    public ArrayList<canciones> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<canciones> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }
    
}
