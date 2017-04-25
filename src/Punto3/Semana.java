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
public class Semana {

    private ArrayList<Sala> salas;
    private Dia[] diashabiles;
    private int numerosemana;
    private int diaregis;

    public Semana(int numerosemana) {
        this.numerosemana = numerosemana;

        this.diashabiles = new Dia[5];
        salas = new ArrayList<>();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public int getNumerosemana() {
        return numerosemana;
    }

    public void setNumerosemana(int numerosemana) {
        this.numerosemana = numerosemana;
    }

    public int getDiaregis() {
        return diaregis;
    }

    public void setDiaregis(int diaregis) {
        this.diaregis = diaregis;
    }

    public Dia[] getDiashabiles() {
        return diashabiles;
    }

    public void Añadirdía(Dia dias) {
        if (diaregis < diashabiles.length) {
            diashabiles[diaregis] = dias;
            diaregis++;
        }

    }

    public void AñadirSala(Sala sala) {
        this.salas.add(sala);
    }

    public void ListarDias() {

        for (int i = 0; i < diashabiles.length; i++) {
           
             System.out.println(diashabiles[i].getDia() + " " + diashabiles[i].getNombre());
        
            
        }

    }

}
