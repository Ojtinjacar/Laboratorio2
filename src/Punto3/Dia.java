/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Dia {

    private ArrayList<Pelicula> pelicula;
    private String dia;
    private String nombre;

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dia() {
        this.pelicula = new ArrayList<>();

    }

    public void AñadirPelicula(Pelicula pelicula) {
        this.pelicula.add(pelicula);
    }

    public Dia(String dia, String nombre) {
        this.dia = dia;
        this.nombre = nombre;
        this.pelicula = new ArrayList<>();

    }

    public void ListarPelicula() {
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1.getNombre());
        }
    }

}
