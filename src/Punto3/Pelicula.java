/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author oscar
 */
public class Pelicula {

    private String nombre;
    private String autor;
    private int duracion;
    private String HoraInicio;
    private String HoraFin;

    public Pelicula(String nombre, int duracion, String HoraInicio, String HoraFin) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public Pelicula() {
    }

}
