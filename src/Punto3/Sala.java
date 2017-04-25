/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author oscar
 */
public class Sala {

    private ArrayList<Semana> semanas;
    private String Sala;

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public Sala(String Sala) {
        this.Sala = Sala;
        this.semanas = new ArrayList<>();

    }

    public void adicionarsemana(Semana semanas) {
        this.semanas.add(semanas);
    }
public void ListarSemana(){
    for (Semana semana : semanas) {
        System.out.println("La sala"+" tiene programacion de la semana " + semana.getNumerosemana() );
    }
}
}
