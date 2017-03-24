/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2_franklin_garcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class admiUsuarios {
    private ArrayList<usuarios> lista_usuario = new ArrayList();
    private File archivo = null;

    public admiUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuarios> getLista_Usuario() {
        return lista_usuario;
    }

    public void setLista_Usuario(ArrayList<usuarios> lista_usuarios) {
        this.lista_usuario = lista_usuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(usuarios a) {
        lista_usuario.add(a);
    }

    public void cargarArchivo() {
        try {
            lista_usuario = new ArrayList();
            usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuarios) objeto.readObject()) != null) {
                        lista_usuario.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (usuarios t : lista_usuario) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
