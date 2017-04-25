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
public class Programación {

    private ArrayList<Sala> Salas;

    public ArrayList<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(ArrayList<Sala> Salas) {
        this.Salas = Salas;
    }
    
    

    public Programación() {
        this.Salas= new ArrayList<>();
       
    }
public void ListarInfoSalas(){
    System.out.println("Salas");
   for (Sala Sala1 : Salas) {
            System.out.println("El cine posee "+ Salas.size() + " salas");
            
        } 
}
 
    public void AdicionarSalas(Sala sala){
        this.Salas.add(sala);
    }

    public void ListarSalas() {
        for (Sala Sala1 : Salas) {
            System.out.println("El cine posee la sala "+ Sala1.getSala());
        }
    }
}
